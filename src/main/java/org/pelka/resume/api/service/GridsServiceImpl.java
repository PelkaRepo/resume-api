package org.pelka.resume.api.service;

import java.util.ArrayList;

import org.pelka.resume.api.model.Grids;
import org.springframework.stereotype.Service;

/**
 * Implementation of REST service which retrieves grid data
 * 
 * @author arnoldpelka
 *
 */
@Service
public class GridsServiceImpl implements GridsService {

	/* (non-Javadoc)
	 * @see org.pelka.resume.api.service.GridsService#getAllGrids()
	 */
	@Override
	public ArrayList<Grids> getAllGrids() {
		// TODO Auto-generated method stub
		return new ArrayList<Grids>();
	}

}
