package fr.ibformation.gestioncinema.dao;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.gestioncinema.beans.Film;

public interface FilmDao extends CrudRepository<Film, Integer>  {

}
