package org.pelka.resume.api.rest;

import java.util.ArrayList;

import org.pelka.resume.api.model.Subnotes;
import org.pelka.resume.api.service.SubnotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * REST context and parameter definitions for obtaining local data from
 * the <strong>personal</strong> collection.
 * 
 * @author arnoldpelka
 *
 */
@RestController
public class SubnotesApi {
	private static final String JSON = MediaType.APPLICATION_JSON_VALUE;
	private final SubnotesService subnotesService;
	
	@Autowired
	public SubnotesApi (SubnotesService subnotesService) {
		this.subnotesService = subnotesService;
	}
	
	@RequestMapping(value = "/subnotes", method = GET, produces = JSON)
	public ArrayList<Subnotes> allSubnotes() {
		return this.subnotesService.getAllSubnotes();
	}
}
