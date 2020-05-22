package com.sample.app;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sample.app.templates.model.Employee;
import com.sample.app.util.FreeMarkerUtil;

public class EmployeesInfoPopulator {
	public static void main(String args[]) throws Exception {
		Employee emp1 = new Employee(1, "Krishna", "Gurram");
		Employee emp2 = new Employee(2, "Ram", "Kota");
		Employee emp3 = new Employee(3, "Gopi", "Battu");
		Employee emp4 = new Employee(4, "Joel", "Chelli");

		List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4);

		Map<String, Object> modelObject = new HashMap<String, Object>();
		modelObject.put("employees", empList);

		StringWriter stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "employeesInfo.ftl");
		System.out.println(stringWriter.toString());

	}
}
