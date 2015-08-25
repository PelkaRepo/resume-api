package org.pelka.resume.api.service;

import java.util.ArrayList;

import org.pelka.resume.api.model.Facets;

/**
 * Interface for REST service component that retrieves facet-related data
 * 
 * @author arnoldpelka
 *
 */
public interface FacetsService {
	/**
	 * Retrieves all available person artifacts from the local repositories
	 * 
	 * @return Person data object
	 */
	ArrayList<Facets> getAllFacets();
}
