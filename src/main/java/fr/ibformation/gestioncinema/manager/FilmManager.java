package fr.ibformation.gestioncinema.manager;

import java.time.LocalDate;

import fr.ibformation.gestioncinema.beans.Film;

public interface FilmManager {

	Iterable<Film> findAll();
	Iterable<Film> findByDateSortieAfter(LocalDate dateSortieSemaine);

	Film save(Film film);

}
