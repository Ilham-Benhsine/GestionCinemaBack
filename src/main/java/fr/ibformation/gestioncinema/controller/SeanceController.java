package fr.ibformation.gestioncinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.gestioncinema.beans.Seance;
import fr.ibformation.gestioncinema.manager.SeanceManager;

@RestController
@RequestMapping("/seance")
public class SeanceController {
	
	@Autowired
	SeanceManager seanceManager;
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, path = ("/"))
	public Iterable<Seance> getSeance() {
		return seanceManager.findAll();
	}
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST, path = ("/ajouter/"))
	public Seance saveSeance(@RequestBody Seance seance) {
		System.out.println(seance);
		return seanceManager.save(seance);
	}
}
