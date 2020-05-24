package com.sample.app;

import java.io.StringWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class StringTemplateLoaderDemo {
	public static void main(String args[]) throws Exception {

		String copyRightTemplate = "---------------------------------------------------------------------------------\n"
				+ "All these examples are owned by https://self-learning-java-tutorial.blogspot.com/\n"
				+ "You can use these examples and share to others also\n" + "\n" + "Author: Krishna\n"
				+ "Date: ${today?datetime}\n"
				+ "---------------------------------------------------------------------------------";

		String welcomeTemplate = "<#-- Include Demo -->\n" + "\n" + "<#include \"/copyright\">\n" + "\n"
				+ "Hello ${name}, Welcome to our Application.";

		StringTemplateLoader stringLoader = new StringTemplateLoader();
		stringLoader.putTemplate("copyright", copyRightTemplate);
		stringLoader.putTemplate("welcomeTemplate", welcomeTemplate);

		Configuration configuration = new Configuration(Configuration.VERSION_2_3_30);
		configuration.setTemplateLoader(stringLoader);

		Map<String, Object> rootObject = new HashMap<>();

		rootObject.put("today", new Date());
		rootObject.put("name", "Krishna");

		Template template = configuration.getTemplate("welcomeTemplate");

		StringWriter stringWriter = new StringWriter();
		template.process(rootObject, stringWriter);

		System.out.println(stringWriter.toString());

	}
}