package org.pelka.resume.api.rest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Ping-able REST API for assuring that the dispatcher servlet is functional on
 * the deployed server
 * 
 * @author arnoldpelka
 *
 */
@RestController
public class DefaultContextApi {
	private static Log logger = LogFactory.getLog(DefaultContextApi.class);
	private static final String TXT = MediaType.TEXT_PLAIN_VALUE;

	@RequestMapping(value = "/", method = GET, produces = TXT)
	public String ping() {
		String msg = "The resume API service is up and running";
		logger.debug(msg);
		return msg;
	}
}
