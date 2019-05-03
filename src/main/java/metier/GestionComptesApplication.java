package metier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import metier.Operations;

@SpringBootApplication
public class GestionComptesApplication {
	
	private static final Logger log = LoggerFactory.getLogger(GestionComptesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GestionComptesApplication.class, args);
	}
	
	Client C1 = new Client("Michel");
	Client C2 = new Client("Josiane");
	
	@Bean
	public CommandLineRunner TableCreate(CrudClient repositoryClient) {
		return (args) -> {
			
			// fetch all clients
			log.info("Demarrage client");
			
			// save a couple of clients
			repositoryClient.save(C1);
			repositoryClient.save(C2);
			System.out.println(repositoryClient.findAll());
			System.out.println(repositoryClient.findByNomContaining("Mich"));
	
			// fetch all clients
			log.info("Terminee client");

		};
	}
	
	CompteEpargne CptE1 = new CompteEpargne(7491.22, "12/12/2011", C1, 1.3);
	CompteCourant CptC1 = new CompteCourant(457.22, "12/12/2011", C1, 200);
	CompteEpargne CptE2 = new CompteEpargne(45792.83, "21/12/2012", C2, 1.5);
	CompteCourant CptC2 = new CompteCourant(992.54, "21/12/2012", C2, 500);
	
	@Bean
	public CommandLineRunner TableCreate2(CrudCompte repositoryCompte) {
		return (args) -> {
			
			// fetch all comptes
			log.info("Demarrage compte");

			// save a couple of comptes
			repositoryCompte.save(CptE1);
			repositoryCompte.save(CptC1);
			repositoryCompte.save(CptE2);
			repositoryCompte.save(CptC2);
			System.out.println(repositoryCompte.findById(1));
			System.out.println(repositoryCompte.findById(2));
			System.out.println(repositoryCompte.findById(3));
			System.out.println(repositoryCompte.findById(4));
	
			// fetch all comptes
			log.info("Terminee compte");

		};
	}
	
	Operations Ope1 = new Retrait("12/12/2019", 500, CptE1);
	Operations Ope2 = new Versement("20/10/2019", 300, CptC1);
	Operations Ope3 = new Versement("15/05/2019", 250, CptC2);
	Operations Ope4 = new Retrait("18/04/2019", 100, CptE2);
	
	@Bean
	public CommandLineRunner TableCreate3(CrudOperations repositoryOperations) {
		return (args) -> {
			
			// fetch all operations
			log.info("Demarrage operations");

			// save a couple of operations
			repositoryOperations.save(Ope1);
			repositoryOperations.save(Ope2);
			repositoryOperations.save(Ope3);
			repositoryOperations.save(Ope4);
	
			// fetch all operations
			log.info("Terminee operations");

		};
	}
	
	@Bean
	public CommandLineRunner TableCreate4(CrudCompte repositoryCompte) {
		return (args) -> {
			
			// fetch all comptes
			log.info("Changement compte");

			// save a couple of comptes
	
			// fetch all comptes
			log.info("Fin changement compte");

		};
	}
	
}
