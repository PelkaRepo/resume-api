package org.pelka.resume.api.rest;

import java.util.ArrayList;

import org.pelka.resume.api.model.Personal;
import org.pelka.resume.api.service.PersonalService;
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
public class PersonalApi {
	private static final String JSON = MediaType.APPLICATION_JSON_VALUE;
	private final PersonalService personalService;
	
	@Autowired
	public PersonalApi (PersonalService personalService) {
		this.personalService = personalService;
	}
	
	@RequestMapping(value = "/personal", method = GET, produces = JSON)
	public ArrayList<Personal> allPersons() {
		return this.personalService.getAllPersons();
	}
}
