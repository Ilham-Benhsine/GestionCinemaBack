package fr.ibformation.gestioncinema.dao;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.gestioncinema.beans.Film;

public interface FilmDao extends CrudRepository<Film, Integer>  {
	
	public Iterable<Film> findAll();
	
	public Iterable<Film> findByDateSortieAfter(LocalDate dateSortieSemaine);
	
}
