package fr.ibformation.gestioncinema.dao;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.gestioncinema.beans.Genre;

public interface GenreDao extends CrudRepository<Genre, Integer>  {

}
