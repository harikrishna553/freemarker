package com.sample.app;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.sample.app.util.FreeMarkerUtil;

public class BuiltInPopulator {
	public static void main(String args[]) throws Exception {

		Map<String, Object> modelObject = new HashMap<String, Object>();
		modelObject.put("name", "Krishna");
		
		StringWriter stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "builtIns.ftl");
		System.out.println(stringWriter.toString().trim());

	}
}
