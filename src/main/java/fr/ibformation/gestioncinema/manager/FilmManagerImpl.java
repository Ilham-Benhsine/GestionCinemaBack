package fr.ibformation.gestioncinema.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.gestioncinema.beans.Film;
import fr.ibformation.gestioncinema.dao.FilmDao;

@Service
public class FilmManagerImpl implements FilmManager {
	
	@Autowired
	FilmDao filmDao ;

	@Override
	public Iterable<Film> findAll() {
		return filmDao.findAll();
	}

}
