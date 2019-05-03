package metier;

import javax.persistence.Entity;

@Entity
public class CompteEpargne extends Compte {

	private double tauxInteret;

	CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	CompteEpargne(double solde, String dateCreation, Client client) {
		super(solde, dateCreation, client);
		// TODO Auto-generated constructor stub
	}

	CompteEpargne(double solde, String dateCreation, Client client, double tauxInteret) {
		super(solde, dateCreation, client);
		this.tauxInteret = tauxInteret;
	}

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	@Override
	public String toString() {
		return "CompteEpargne [tauxInteret=" + tauxInteret + "]";
	}
		
}
