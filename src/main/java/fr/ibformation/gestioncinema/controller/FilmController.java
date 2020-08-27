package fr.ibformation.gestioncinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
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

	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, path = ("/"))
	public Iterable<Film> getFilm() {
		return filmManager.findAll();
	}

	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST, path = ("/ajouter/"))
	public Film saveFilm(@RequestBody Film film) {
		System.out.println(film);
		return filmManager.save(film);
	}

}
