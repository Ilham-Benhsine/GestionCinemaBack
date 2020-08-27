package fr.ibformation.gestioncinema.beans;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
	@Column(length = 1500)
	private String description;
	private LocalDate dateSortie;
	private String nomImg;
	@ManyToMany
	private List<Nationalite> nationalites;
	@ManyToMany
	private List<Acteur> acteurs;
	@ManyToMany
	private List<Genre> genres;
	@ManyToMany
	private List<Realisateur> realisateurs;
	
}
