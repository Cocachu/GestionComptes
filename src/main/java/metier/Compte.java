package metier;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "compte")
public class Compte {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int codeCompte;
	private double solde;
	private String dateCreation;
	@ManyToOne 
	@JoinColumn (name = "client")
	private Client client;
	private Operations[] operations;
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	Compte(double solde, String dateCreation, Client client) {
		super();
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.client = client;
//		this.operations = operations;
	}

	public int getCodeCompte() {
		return codeCompte;
	}

	public void setCodeCompte(int codeCompte) {
		this.codeCompte = codeCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Operations[] getOperations() {
		return operations;
	}

	public void setOperations(Operations[] operations) {
		this.operations = operations;
	}

	@Override
	public String toString() {
		return "Compte [code=" + codeCompte + ", solde=" + solde + ", dateCreation=" + dateCreation + ", client=" + client
				+ ", operations=" + Arrays.toString(operations) + "]";
	}
	
}
