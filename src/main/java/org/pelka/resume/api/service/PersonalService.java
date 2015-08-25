package org.pelka.resume.api.service;

import java.util.ArrayList;

import org.pelka.resume.api.model.Personal;

/**
 * Interface for REST service component that retrieves personal-related data
 * 
 * @author arnoldpelka
 *
 */
public interface PersonalService {
	/**
	 * Retrieves all available person artifacts from the local repositories
	 * 
	 * @return Person data object
	 */
	ArrayList<Personal> getAllPersons();
}
