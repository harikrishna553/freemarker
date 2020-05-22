package com.sample.app;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.sample.app.util.FreeMarkerUtil;

public class StudentGradePopulator {
	public static void main(String args[]) throws Exception {
		Map<String, Object> modelObject = new HashMap<String, Object>();

		modelObject.put("marks", 30);

		StringWriter stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "studentGrades.ftl");
		System.out.println(stringWriter.toString().trim());
		
		modelObject.put("marks", 50);
		stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "studentGrades.ftl");
		System.out.println(stringWriter.toString().trim());
		
		modelObject.put("marks", 70);
		stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "studentGrades.ftl");
		System.out.println(stringWriter.toString().trim());
		
		modelObject.put("marks", 80);
		stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "studentGrades.ftl");
		System.out.println(stringWriter.toString().trim());
		
	}

}
