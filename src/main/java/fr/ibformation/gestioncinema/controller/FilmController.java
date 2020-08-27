package fr.ibformation.gestioncinema.controller;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	public Iterable<Film> getPersonne() {
		return filmManager.findAll();
		
		
		//return filmManager.findAll();
	}
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, path = ("/alaffiche"))
	public Iterable<Film> getFilmALAffiche(){
		System.out.println("getFilmALAffiche");

		return filmManager.findByDateSortieAfter(LocalDate.of(2020, Month.AUGUST, 15));
	}
	//return filmManager.findByDateSortieAfter();
}
