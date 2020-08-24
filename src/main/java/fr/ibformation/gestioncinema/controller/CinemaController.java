package fr.ibformation.gestioncinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.gestioncinema.beans.Cinema;
import fr.ibformation.gestioncinema.manager.CinemaManager;

@RestController
@RequestMapping("/cinema")
public class CinemaController {
	
	@Autowired
	CinemaManager cinemaManager;
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, path = ("/"))
	public Iterable<Cinema> getPersonne() {
		return cinemaManager.findAll();
	}

}

