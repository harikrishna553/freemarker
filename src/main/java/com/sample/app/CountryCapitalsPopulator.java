package com.sample.app;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.sample.app.util.FreeMarkerUtil;

public class CountryCapitalsPopulator {
	public static void main(String args[]) throws Exception {

		Map<String, Object> countriesMap = new HashMap<>();
		countriesMap.put("India", "New Delhi");
		countriesMap.put("Nepal", "Khatmandu");
		countriesMap.put("Italy", "Vienna");
		
		Map<String, Object> modelObject = new HashMap<> ();
		modelObject.put("countries", countriesMap);
		
		StringWriter stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "countryCapitals.ftl");
		System.out.println(stringWriter.toString().trim());

	}
}
