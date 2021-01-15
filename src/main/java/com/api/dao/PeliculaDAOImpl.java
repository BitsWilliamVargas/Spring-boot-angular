package com.api.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.api.model.Pelicula;

@Repository
public class PeliculaDAOImpl implements PeliculaDAO{

	@Autowired
	private SessionFactory sessionFactory;
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
	public List<Pelicula> list() {
		// TODO Auto-generated method stub
		List<Pelicula> lista= sessionFactory.getCurrentSession().createQuery("from Pelicula").list();
		return lista; 
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
