package fr.ibformation.gestioncinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.gestioncinema.beans.Salle;
import fr.ibformation.gestioncinema.manager.SalleManager;

@RestController
@RequestMapping("/salle")
public class SalleController {
	
	@Autowired
	SalleManager salleManager;
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, path = ("/"))
	public Iterable<Salle> getSalle() {
		return salleManager.findAll();
	}

}

