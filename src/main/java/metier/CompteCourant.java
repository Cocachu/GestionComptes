package metier;

import javax.persistence.Entity;

@Entity
public class CompteCourant extends Compte {

	private double decouvert;

	CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	CompteCourant(double solde, String dateCreation, Client client) {
		super(solde, dateCreation, client);
		// TODO Auto-generated constructor stub
	}

	CompteCourant(double solde, String dateCreation, Client client, double decouvert) {
		super(solde, dateCreation, client);
		this.decouvert = decouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + "]";
	}

}
