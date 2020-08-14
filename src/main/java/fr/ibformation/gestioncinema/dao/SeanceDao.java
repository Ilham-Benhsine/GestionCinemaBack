package fr.ibformation.gestioncinema.dao;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.gestioncinema.beans.Seance;

public interface SeanceDao extends CrudRepository<Seance, Integer>  {

}
