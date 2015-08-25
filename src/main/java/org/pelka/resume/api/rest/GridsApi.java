package org.pelka.resume.api.rest;

import java.util.ArrayList;

import org.pelka.resume.api.model.Grids;
import org.pelka.resume.api.service.GridsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * REST context and parameter definitions for obtaining local data from
 * the <strong>grids</strong> collection.
 * 
 * @author arnoldpelka
 *
 */
@RestController
public class GridsApi {
	private static final String JSON = MediaType.APPLICATION_JSON_VALUE;
	private final GridsService gridsService;
	
	@Autowired
	public GridsApi (GridsService gridsService) {
		this.gridsService = gridsService;
	}
	
	@RequestMapping(value = "/grids", method = GET, produces = JSON)
	public ArrayList<Grids> allGrids() {
		return this.gridsService.getAllGrids();
	}
}
