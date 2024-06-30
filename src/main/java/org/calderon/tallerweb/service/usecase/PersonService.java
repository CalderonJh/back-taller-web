package org.calderon.tallerweb.service.usecase;

import java.util.List;
import org.calderon.tallerweb.dto.person.PersonPatchDTO;
import org.calderon.tallerweb.entity.Person;

public interface PersonService {
  Person save(Person person);

  Person update(PersonPatchDTO dto);

  Person getPerson(Long id);

  List<Person> getAll();

  void delete(Long personId);
}
