package metier;

import javax.persistence.Entity;

@Entity
public class Versement extends Operations {

	Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	Versement(String dateOpe, double montant, Compte compte) {
		super(dateOpe, montant, compte);
		compte.setSolde(montant + compte.getSolde());
		// TODO Auto-generated constructor stub
	}
	
}
