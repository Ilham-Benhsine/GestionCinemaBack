package fr.ibformation.gestioncinema.manager;

import fr.ibformation.gestioncinema.beans.Film;

public interface FilmManager {

	Iterable<Film> findAll();

}
