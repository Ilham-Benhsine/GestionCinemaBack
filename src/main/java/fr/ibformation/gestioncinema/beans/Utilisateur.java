package fr.ibformation.gestioncinema.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	// TODO pseudo unique
	private String pseudo;
	public int getId() {
		return id;
	}
	
	private String password;
	private String prenom;
	private String nom;
	private LocalDate anniversaire;
	private String adresse;
	private String type;

}
