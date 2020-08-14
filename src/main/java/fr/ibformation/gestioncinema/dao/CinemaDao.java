package fr.ibformation.gestioncinema.dao;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.gestioncinema.beans.Cinema;

public interface CinemaDao extends CrudRepository<Cinema, Integer>{

}
