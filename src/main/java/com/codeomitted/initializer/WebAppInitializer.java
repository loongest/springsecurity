package com.codeomitted.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.codeomitted.config.RootConfiguration;
import com.codeomitted.config.WebMvcConfiguration;
import com.codeomitted.config.WebSecurityConfiguration;


public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { RootConfiguration.class, WebSecurityConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebMvcConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
}