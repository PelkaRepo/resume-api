package org.pelka.resume.api.service;

import java.util.ArrayList;

import org.pelka.resume.api.model.Facets;
import org.springframework.stereotype.Service;

/**
 * Implementation of REST service which retrieves facet data
 * 
 * @author arnoldpelka
 *
 */
@Service
public class FacetsServiceImpl implements FacetsService {

	/* (non-Javadoc)
	 * @see org.pelka.resume.api.service.FacetsService#getAllFacets()
	 */
	@Override
	public ArrayList<Facets> getAllFacets() {
		// TODO Auto-generated method stub
		return new ArrayList<Facets>();
	}

}
