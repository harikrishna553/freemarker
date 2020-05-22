package com.sample.app;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.sample.app.util.FreeMarkerUtil;

public class IncludeDemoPopulator {
	public static void main(String args[]) throws Exception {

		Map<String, Object> modelObject = new HashMap<String, Object>();
		modelObject.put("name", "Krishna");
		modelObject.put("today", new java.util.Date().toString());

		StringWriter stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "includeDemo.ftl");
		System.out.println(stringWriter.toString().trim());

	}
}
