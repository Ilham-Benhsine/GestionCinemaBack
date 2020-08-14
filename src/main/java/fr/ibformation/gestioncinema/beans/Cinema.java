package fr.ibformation.gestioncinema.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Cinema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String adresse;
	private int nombreSalles;
	private float prixHT;
	private float sup3D;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_cinema")
	private List<Salle> salles;

}
