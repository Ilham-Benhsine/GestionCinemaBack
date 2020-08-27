package fr.ibformation.gestioncinema.manager;

import fr.ibformation.gestioncinema.beans.Utilisateur;

public interface UtilisateurManager {

	Utilisateur save(Utilisateur util);

	Utilisateur checkIfExist(Utilisateur util);

	Utilisateur findByPseudo(String pseudo);

	boolean checkIfPseudoAvailable(Utilisateur util);

}
