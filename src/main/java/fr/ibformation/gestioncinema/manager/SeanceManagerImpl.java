package fr.ibformation.gestioncinema.manager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

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
		// récupération des séances
		Iterable<Seance> seances = seanceDao.findAll();
		
		// séances dans une collection
		Iterator<Seance> iterator = seances.iterator();
		List<Seance> listeSeances = new ArrayList<Seance>();
		iterator.forEachRemaining(listeSeances::add);
		
		// tri par datetime croissant
		Collections.sort(listeSeances, new Comparator<Seance>() {
		    @Override
		    public int compare(Seance seance1, Seance seance2) {
		        return seance1.getHoraire().compareTo(
		        		seance2.getHoraire());
		    }
		});
		
		return listeSeances;
	}

	@Override
	public Seance save(Seance seance) {
		return seanceDao.save(seance);
	}

}
