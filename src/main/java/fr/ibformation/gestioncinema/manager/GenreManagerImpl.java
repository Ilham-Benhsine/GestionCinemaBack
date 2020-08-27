package fr.ibformation.gestioncinema.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.gestioncinema.beans.Genre;
import fr.ibformation.gestioncinema.dao.GenreDao;

@Service
public class GenreManagerImpl implements GenreManager {
	
	@Autowired
	GenreDao genreDao;

	@Override
	public Iterable<Genre> findAll() {
		return genreDao.findAll();
	}

}
