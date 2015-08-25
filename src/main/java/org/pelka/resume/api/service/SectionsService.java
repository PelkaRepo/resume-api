package org.pelka.resume.api.service;

import java.util.ArrayList;

import org.pelka.resume.api.model.Sections;

/**
 * Interface for REST service component that retrieves section-related data
 * 
 * @author arnoldpelka
 *
 */
public interface SectionsService {
	/**
	 * Retrieves all available person artifacts from the local repositories
	 * 
	 * @return Person data object
	 */
	ArrayList<Sections> getAllSections();
}
