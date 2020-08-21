package fr.ibformation.gestioncinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.gestioncinema.beans.Film;
import fr.ibformation.gestioncinema.manager.FilmManager;

@RestController
@RequestMapping("/film")
public class FilmController {
	
	@Autowired
	FilmManager filmManager;
	
	@RequestMapping(method = RequestMethod.GET, path = ("/"))
	public Iterable<Film> getPersonne() {
		return filmManager.findAll();
	}

}
