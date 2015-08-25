package org.pelka.resume.api.rest;

import java.util.ArrayList;

import org.pelka.resume.api.model.Sections;
import org.pelka.resume.api.service.SectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * REST context and parameter definitions for obtaining local data from
 * the <strong>sections</strong> collection.
 * 
 * @author arnoldpelka
 *
 */
@RestController
public class SectionsApi {
	private static final String JSON = MediaType.APPLICATION_JSON_VALUE;
	private final SectionsService sectionsService;
	
	@Autowired
	public SectionsApi (SectionsService sectionsService) {
		this.sectionsService = sectionsService;
	}
	
	@RequestMapping(value = "/sections", method = GET, produces = JSON)
	public ArrayList<Sections> allSections() {
		return this.sectionsService.getAllSections();
	}
}
