package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Pelicula;
import com.api.service.PeliculaService;

@RestController
 
public class PeliculaController {

	@Autowired
	private PeliculaService peliculaService;
	
	@GetMapping("/api/peliculas")
	public ResponseEntity<List<Pelicula>> getPeliculas(){
		List<Pelicula>  list = peliculaService.list();
		return ResponseEntity.ok().body(list);
	}

}
