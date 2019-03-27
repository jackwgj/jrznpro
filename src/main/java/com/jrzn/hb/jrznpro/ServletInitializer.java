package com.jrzn.hb.jrznpro;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		//application.initializers(MyApplicationContextInitializer1,MyApplicationContextInitializer2);
		//application.listeners(MyApplicationListener1,MyApplicationListener2)

		return application.sources(JrznproApplication.class);
	}

}
