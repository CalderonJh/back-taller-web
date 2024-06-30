package org.calderon.tallerweb.repository;

import org.calderon.tallerweb.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
  boolean existsByEmail(String email);

  boolean existsByUsername(String username);
}
