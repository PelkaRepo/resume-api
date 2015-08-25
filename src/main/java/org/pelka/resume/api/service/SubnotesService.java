package org.pelka.resume.api.service;

import java.util.ArrayList;

import org.pelka.resume.api.model.Subnotes;

/**
 * Interface for REST service component that retrieves subnote-related data
 * 
 * @author arnoldpelka
 *
 */
public interface SubnotesService {
	/**
	 * Retrieves all available person artifacts from the local repositories
	 * 
	 * @return Person data object
	 */
	ArrayList<Subnotes> getAllSubnotes();
}
