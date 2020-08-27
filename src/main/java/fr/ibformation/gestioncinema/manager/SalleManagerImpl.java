package fr.ibformation.gestioncinema.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.gestioncinema.beans.Salle;
import fr.ibformation.gestioncinema.dao.SalleDao;

@Service
public class SalleManagerImpl implements SalleManager {

	@Autowired
	SalleDao salleDao;
	
	@Override
	public Iterable<Salle> findAll() {
		return salleDao.findAll();
	}

}

/*
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

}*/