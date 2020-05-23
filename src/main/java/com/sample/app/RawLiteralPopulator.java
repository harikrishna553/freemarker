package com.sample.app;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.sample.app.util.FreeMarkerUtil;

public class RawLiteralPopulator {
	public static void main(String args[]) throws Exception {

		Map<String, Object> modelObject = new HashMap<String, Object>();
		
		StringWriter stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "rawLiteral.ftl");
		System.out.println(stringWriter.toString().trim());

	}
}
