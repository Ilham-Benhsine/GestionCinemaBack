package fr.ibformation.gestioncinema.dao;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.gestioncinema.beans.Acteur;

public interface ActeurDao extends CrudRepository<Acteur, Integer>  {

}
