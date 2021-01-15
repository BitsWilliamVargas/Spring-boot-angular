package com.api.service;

import java.util.List;

import com.api.model.Pelicula;

public interface PeliculaService {

	long save(Pelicula pelicula); //Guardar una pelicula
	Pelicula get(long id); //Obtener una pelicula
	List<Pelicula> list(); //Listar peliculas
	void update(long id, Pelicula pelicula); //Actualizar peliculas
	void delete(long id); //Eliminar peliculas
}
