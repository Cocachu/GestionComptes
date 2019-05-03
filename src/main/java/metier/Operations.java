package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "operations")
public class Operations {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int numero;
	private String dateOpe;
	private double montant;
	@ManyToOne 
	@JoinColumn (name = "compte")
	private Compte compte;
	
	Operations() {
		super();
		// TODO Auto-generated constructor stub
	}

	Operations( String dateOpe, double montant, Compte compte) {
		super();
		this.dateOpe = dateOpe;
		this.montant = montant;
		this.compte = compte;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDateOpe() {
		return dateOpe;
	}

	public void setDateOpe(String dateOpe) {
		this.dateOpe = dateOpe;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@Override
	public String toString() {
		return "Operations [numero=" + numero + ", dateOpe=" + dateOpe + ", montant=" + montant + ", compte=" + compte
				+ "]";
	}

	
//	public void Versement(Compte c) {
//		c.setSolde(c.getSolde() + getMontant());
//	}
	
//	public void Retrait(Compte c) {
//		c.setSolde(c.getSolde() - getMontant());
//	}

}
