package fr.ibformation.gestioncinema.dao;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.gestioncinema.beans.Utilisateur;

public interface UtilisateurDao extends CrudRepository<Utilisateur, Integer>  {

}
