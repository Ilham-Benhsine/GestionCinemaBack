package fr.ibformation.gestioncinema.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformation.gestioncinema.beans.Seance;
import fr.ibformation.gestioncinema.dao.SeanceDao;

@Service
public class SeanceManagerImpl implements SeanceManager {

	@Autowired
	SeanceDao seanceDao;
	
	@Override
	public Iterable<Seance> findAll() {
		return seanceDao.findAll();
	}

}
