package metier;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CrudClient  extends CrudRepository<Client, Integer> {

    List<Client> findByNomContaining(String nom);
}
