package org.pelka.resume.api.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

/**
 * Defines application context and web application configuration.
 * Also contains main thread entry.
 * 
 * @author arnoldpelka
 *
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

	/**
	 * Main thread entry for setting application context, etc.
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}

}
