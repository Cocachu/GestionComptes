package metier;

import javax.persistence.Entity;

@Entity
public class Retrait extends Operations {

	Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	Retrait(String dateOpe, double montant, Compte compte) {
		super(dateOpe, montant, compte);
		compte.setSolde(compte.getSolde() - montant);
		// TODO Auto-generated constructor stub
	}

}
