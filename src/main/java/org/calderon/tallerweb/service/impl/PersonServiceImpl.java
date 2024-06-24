package org.calderon.tallerweb.service.impl;

import org.calderon.tallerweb.entity.Person;
import org.calderon.tallerweb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl {
  private PersonRepository personRepository;

  public Person savePerson(Person person) {
    return this.personRepository.save(person);
  }

  @Autowired
  public void setPersonRepository(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }
}
