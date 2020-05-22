package com.sample.app;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.sample.app.templates.model.GreetUser;
import com.sample.app.util.FreeMarkerUtil;

public class GreetUserPopulator {
	public static void main(String args[]) throws Exception {
		Map<String, Object> modelObject = new HashMap<String, Object>();

		modelObject.put("user", new GreetUser("Krishna", "Male"));

		StringWriter stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "greet.ftl");
		System.out.println(stringWriter);
		
		modelObject.put("user", new GreetUser("Sailu", "Female"));
		stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "greet.ftl");
		System.out.println(stringWriter);
	}

}
