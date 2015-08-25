package org.pelka.resume.api.service;

import java.util.ArrayList;

import org.pelka.resume.api.model.Sections;
import org.springframework.stereotype.Service;

/**
 * Implementation of REST service which retrieves sections data
 * 
 * @author arnoldpelka
 *
 */
@Service
public class SectionsServiceImpl implements SectionsService {

	/* (non-Javadoc)
	 * @see org.pelka.resume.api.service.SectionsService#getAllSections()
	 */
	@Override
	public ArrayList<Sections> getAllSections() {
		// TODO Auto-generated method stub
		return new ArrayList<Sections>();
	}

}
