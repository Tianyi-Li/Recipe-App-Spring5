package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    // We are just creating the method name inside the interface
    // then Spring Data JPA is going to provide us the implementation
    // and via Hibernate, it's going to give us all the plumbing that we need to do
    // to go fetch something out of the database.
    Optional<Category> findByDescription(String description);
}
