package ar.edu.um.isa.onlypoems.repository;

import ar.edu.um.isa.onlypoems.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
