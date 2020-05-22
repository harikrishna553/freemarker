package com.sample.app;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sample.app.util.FreeMarkerUtil;

public class CountryNamesPopulator {
	public static void main(String args[]) throws Exception {
		List<String> countryNamesList = Arrays.asList("India", "Nepal", "Sri Lanka", "Germany");

		Map<String, Object> modelObject = new HashMap<String, Object>();
		modelObject.put("countryNames", countryNamesList);

		StringWriter stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "countryNames.ftl");
		System.out.println(stringWriter.toString().trim());

	}
}
