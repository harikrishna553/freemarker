package com.sample.app;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.sample.app.templates.model.Address;
import com.sample.app.templates.model.UserDetails;
import com.sample.app.util.FreeMarkerUtil;

public class UserDetailsPopulator {
	public static void main(String args[]) throws Exception {
		Map<String, Object> modelObject = new HashMap<String, Object>();

		Address address = new Address("Chowdeswarit Steet", "Bangalore", "India");

		modelObject.put("user", new UserDetails("Krishna", 31, address));

		StringWriter stringWriter = FreeMarkerUtil.mergeModelAndTemplate(modelObject, "userDetails.ftl");

		System.out.println(stringWriter);
	}
}
