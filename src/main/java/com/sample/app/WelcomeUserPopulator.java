package com.sample.app;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.sample.app.templates.model.WelcomeUser;
import com.sample.app.util.FreeMarkerUtil;

public class WelcomeUserPopulator {
	public static void main(String args[]) throws Exception {
		Map<String, Object> modelObject = new HashMap<String, Object>();

		modelObject.put("user", new WelcomeUser("Krishna", "Male"));

		StringWriter stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "welcome.ftl");
		System.out.println(stringWriter.toString().trim());
		
		modelObject.put("user", new WelcomeUser("Sailu", "Female"));
		stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "greet.ftl");
		System.out.println(stringWriter.toString().trim());
	}
}
