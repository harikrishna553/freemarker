package com.sample.app;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.sample.app.templates.model.User;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class LoadDataFromString {

	public static void main(String args[]) throws Exception {
		String userDetailsTemplate = "<#-- User details -->\n" + "name: ${user.name}\n" + "age: ${user.age}\n"
				+ "city: ${user.city}";

		Template template = new Template("My_template", new StringReader(userDetailsTemplate),
				new Configuration(Configuration.VERSION_2_3_30));

		User user = new User("Krishna", 29, "Bangalore");

		Map<String, Object> rootObject = new HashMap<>();
		rootObject.put("user", user);

		StringWriter stringWriter = new StringWriter();
		template.process(rootObject, stringWriter);

		System.out.println(stringWriter.toString());

	}

}
