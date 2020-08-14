package fr.ibformation.gestioncinema.beans;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Seance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	private Film film;
	private LocalDateTime horaire;
	private boolean sup3D;
	private int placesSansReservation;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Utilisateur> utilisateurs;

	public int getPlacesVendues() {
		return placesSansReservation + utilisateurs.size();
	}

}
