package com.sample.app;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.sample.app.util.FreeMarkerUtil;

public class RangePopulator {
	public static void main(String args[]) throws Exception {

		Map<String, Object> modelObject = new HashMap<String, Object>();
		
		StringWriter stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "range.ftl");
		System.out.println(stringWriter.toString().trim());

	}
}
