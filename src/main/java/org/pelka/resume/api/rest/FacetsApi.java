package org.pelka.resume.api.rest;

import java.util.ArrayList;

import org.pelka.resume.api.model.Facets;
import org.pelka.resume.api.service.FacetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * REST context and parameter definitions for obtaining local data from the
 * <strong>facets</strong> collection.
 * 
 * @author arnoldpelka
 *
 */
@RestController
public class FacetsApi {
	private static final String JSON = MediaType.APPLICATION_JSON_VALUE;
	private final FacetsService facetsService;

	@Autowired
	public FacetsApi(FacetsService facetsService) {
		this.facetsService = facetsService;
	}

	@RequestMapping(value = "/facets", method = GET, produces = JSON)
	public ArrayList<Facets> allFacets() {
		return this.facetsService.getAllFacets();
	}
}
