package com.sample.app;

import java.io.StringWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.sample.app.util.FreeMarkerUtil;

public class EmployeesInfoPopulator1 {
	public static void main(String args[]) throws Exception {
		Map<String, Object> modelObject = new HashMap<String, Object>();
		modelObject.put("employees", Collections.EMPTY_LIST);

		StringWriter stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "employeesInfo1.ftl");
		System.out.println(stringWriter.toString());

	}
}
