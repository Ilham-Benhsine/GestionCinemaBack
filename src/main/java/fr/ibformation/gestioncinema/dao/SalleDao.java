package fr.ibformation.gestioncinema.dao;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.gestioncinema.beans.Salle;

public interface SalleDao extends CrudRepository<Salle, Integer>  {
	
	public Iterable<Salle> findAll();

}
