package fr.ibformation.gestioncinema.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.gestioncinema.beans.Utilisateur;
import fr.ibformation.gestioncinema.dao.UtilisateurDao;

@Service
public class UtilisateurManagerImpl implements UtilisateurManager {

	@Autowired
	UtilisateurDao utilisateurDao;

	@Override
	public Utilisateur save(Utilisateur util) {
		return utilisateurDao.save(util);
	}

	@Override
	public Utilisateur checkIfExist(Utilisateur util) {
		util = utilisateurDao.findByPseudoAndPassword(util.getPseudo(), util.getPassword());
		if (util != null) {
			return util;
		} else {
			return null;
		}
	}

	@Override
	public Utilisateur findByPseudo(String pseudo) {
		return utilisateurDao.findByPseudo(pseudo);
	}

}
