package org.pelka.resume.api.service;

import java.util.ArrayList;

import org.pelka.resume.api.model.Personal;
import org.springframework.stereotype.Service;

/**
 * Implementation of REST service which retrieves personal data
 * 
 * @author arnoldpelka
 *
 */
@Service
public class PersonalServiceImpl implements PersonalService {

	/* (non-Javadoc)
	 * @see org.pelka.resume.api.service.PersonalService#getAllPersons()
	 */
	@Override
	public ArrayList<Personal> getAllPersons() {
		// TODO Auto-generated method stub
		return new ArrayList<Personal>();
	}

}
