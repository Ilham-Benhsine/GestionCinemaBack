package fr.ibformation.gestioncinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.gestioncinema.beans.Genre;
import fr.ibformation.gestioncinema.manager.GenreManager;

@RestController
@RequestMapping("/genre")
public class GenreController {
	
	@Autowired
	GenreManager genreManager;

	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, path = ("/"))
	public Iterable<Genre> getGenre() {
		return genreManager.findAll();
	}

}
