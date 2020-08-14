package fr.ibformation.gestioncinema.beans;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titre;
	private LocalTime duree;
	private String description;
	private LocalDate dateSortie;
	@ManyToOne
	private Nationalite nationalite;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Acteur> acteurs;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Genre> genres;
	
}
