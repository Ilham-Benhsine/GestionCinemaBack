package fr.ibformation.gestioncinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.gestioncinema.beans.Utilisateur;
import fr.ibformation.gestioncinema.manager.UtilisateurManager;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
	
	@Autowired
	UtilisateurManager utilisateurManager;
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST, path = ("/inscription/"))
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur util) {
		return utilisateurManager.save(util);
	}
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST, path = ("/connexion/"))
	public Utilisateur selectUtilisateur(@RequestBody Utilisateur util) {
		util = utilisateurManager.checkIfExist(util);
		if (util != null) {			
			return util;
		} else {
			return new Utilisateur();
		}
	}

}
