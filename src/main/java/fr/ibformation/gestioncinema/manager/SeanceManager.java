package fr.ibformation.gestioncinema.manager;

import fr.ibformation.gestioncinema.beans.Seance;

public interface SeanceManager {

	Iterable<Seance> findAll();

}
