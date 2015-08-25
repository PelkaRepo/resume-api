package org.pelka.resume.api.service;

import java.util.ArrayList;

import org.pelka.resume.api.model.Subnotes;
import org.springframework.stereotype.Service;

/**
 * Implementation of REST service which retrieves footer data
 * 
 * @author arnoldpelka
 *
 */
@Service
public class SubnotesServiceImpl implements SubnotesService {

	/* (non-Javadoc)
	 * @see org.pelka.resume.api.service.SubnotesService#getAllSubnotes()
	 */
	@Override
	public ArrayList<Subnotes> getAllSubnotes() {
		// TODO Auto-generated method stub
		return new ArrayList<Subnotes>();
	}

}
