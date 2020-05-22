package com.sample.app.util;

import java.io.StringWriter;
import java.util.Locale;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class FreeMarkerUtil {

	private static final Configuration FREE_MARKER_CONFIGURATION = new Configuration(Configuration.VERSION_2_3_30);

	static {
		FREE_MARKER_CONFIGURATION.setClassForTemplateLoading(FreeMarkerUtil.class, "/templates/");
		FREE_MARKER_CONFIGURATION.setDefaultEncoding("UTF-8");
		FREE_MARKER_CONFIGURATION.setLocale(Locale.US);
		FREE_MARKER_CONFIGURATION.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		FREE_MARKER_CONFIGURATION.setFallbackOnNullLoopVariable(false);
	}

	public static StringWriter mergeModelAndTemplate(Object modelObject, String ftlFile) throws Exception {
		StringWriter stringWriter = new StringWriter();

		Template template = FREE_MARKER_CONFIGURATION.getTemplate(ftlFile);

		template.process(modelObject, stringWriter);

		return stringWriter;
	}

}
