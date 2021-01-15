package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.dao.PeliculaDAO;
import com.api.model.Pelicula;

@Service
public class PeliculaServiceImpl implements PeliculaService {

	@Autowired
	private PeliculaDAO peliculaDAO;
	@Override
	public long save(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pelicula get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Pelicula> list() {
		// TODO Auto-generated method stub
		return peliculaDAO.list();
	}

	@Override
	public void update(long id, Pelicula pelicula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
