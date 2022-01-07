package guru.springframework.jdbc.repositories;


import guru.springframework.jdbc.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    /**
     * Optional: A container object which may or may not contain a non-null value. If a value is
     * present, isPresent() returns true. If no value is present, the object is considered empty and
     * isPresent() returns false.
     */
    Optional<Author> findAuthorByFirstNameAndLastName(String firstName, String lastName);
}
