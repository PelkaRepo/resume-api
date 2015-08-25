package org.pelka.resume.api.service;

import java.util.ArrayList;

import org.pelka.resume.api.model.Grids;

/**
 * Interface for REST service component that retrieves grid-related data
 * 
 * @author arnoldpelka
 *
 */
public interface GridsService {
	/**
	 * Retrieves all available person artifacts from the local repositories
	 * 
	 * @return Person data object
	 */
	ArrayList<Grids> getAllGrids();
}
