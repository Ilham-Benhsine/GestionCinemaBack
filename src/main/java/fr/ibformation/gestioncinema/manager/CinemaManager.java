package fr.ibformation.gestioncinema.manager;

import fr.ibformation.gestioncinema.beans.Cinema;

public interface CinemaManager {
	
	Iterable<Cinema> findAll();
	
}
