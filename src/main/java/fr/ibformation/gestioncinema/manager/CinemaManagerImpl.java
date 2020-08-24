package fr.ibformation.gestioncinema.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.gestioncinema.beans.Cinema;
import fr.ibformation.gestioncinema.dao.CinemaDao;

@Service
public class CinemaManagerImpl implements CinemaManager {
	
	@Autowired
	CinemaDao cinemaDao;

	@Override
	public Iterable<Cinema> findAll() {
		return cinemaDao.findAll();
	}

}
