package com.sample.app;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.sample.app.templates.model.User;
import com.sample.app.util.FreeMarkerUtil;

public class UserPopulator {
	public static void main(String args[]) throws Exception {
		Map<String, Object> modelObject = new HashMap<String, Object>();

		modelObject.put("user", new User("Krishna", 31, "Bangalore"));

		StringWriter stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "user.ftl");

		System.out.println(stringWriter);
	}

}
