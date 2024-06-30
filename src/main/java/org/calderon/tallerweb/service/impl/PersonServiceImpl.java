package org.calderon.tallerweb.service.impl;

import static org.calderon.tallerweb.tool.Regex.*;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.ValidationException;
import java.util.Date;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.calderon.tallerweb.dto.person.PersonPatchDTO;
import org.calderon.tallerweb.entity.City;
import org.calderon.tallerweb.entity.Document;
import org.calderon.tallerweb.entity.Person;
import org.calderon.tallerweb.repository.PersonRepository;
import org.calderon.tallerweb.tool.Tools;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor()
public class PersonServiceImpl {
  private final PersonRepository personRepository;

  public Person save(Person person) {
    validatePerson(person);
    validatePost(person);
    return this.personRepository.save(person);
  }

  private void validatePost(Person person) {
    if (this.personRepository.existsByEmail(person.getEmail()))
      throw new ValidationException("This email already exists");
    if (this.personRepository.existsByUsername(person.getUsername()))
      throw new ValidationException("Username already exists");
  }

  public Person update(PersonPatchDTO dto) {
    Person person =
        this.personRepository
            .findById(dto.getId())
            .orElseThrow(() -> new EntityNotFoundException("Cannot find person to update"));
    validarPatch(dto, person);
    Tools.copyProperties(dto, person, "city", "document", "id");
    if (dto.getCity() != null) Tools.copyProperties(dto.getCity(), person.getCity(), "id");
    if (dto.getDocument() != null)
      Tools.copyProperties(dto.getDocument(), person.getDocument(), "id");
    validatePerson(person);
    return this.personRepository.save(person);
  }

  void validarPatch(PersonPatchDTO dto, Person person) {
    if (dto.getEmail() != null
        && !dto.getEmail().equalsIgnoreCase(person.getEmail())
        && this.personRepository.existsByEmail(dto.getEmail())) {
      throw new ValidationException("This email already exists");
    }
    if (dto.getUsername() != null
        && !dto.getUsername().equals(person.getUsername())
        && this.personRepository.existsByUsername(dto.getUsername())) {
      throw new ValidationException("This username already exists");
    }
  }

  private void validatePerson(Person person) {
    validateName(person.getName(), "Person name");
    validateName(person.getLastName(), "Person last name");
    validateDocument(person.getDocument());
    validateCity(person.getCity());
    validateBirthDate(person.getBirthDate());
    validateEmail(person.getEmail());
    validatePhone(person.getPhone());
    validateUsername(person.getUsername());
    validatePassword(person.getPassword());
  }

  private void validateName(String name, String field) {
    if (name == null || name.isEmpty())
      throw new ValidationException(String.format("%s is required", field));
  }

  private void validateDocument(Document document) {
    if (document == null) throw new ValidationException("Document is required");
    if (document.getType() == null) throw new ValidationException("Document type is required");
    if (document.getNumber() == null || !matches(DOCUMENT, document.getNumber()))
      throw new ValidationException("Document number is not valid");
  }

  private void validateCity(City city) {
    if (city == null) throw new ValidationException("City is required");
    validateName(city.getName(), "City name");
    validateName(city.getCountry(), "City country name");
    validateName(city.getState(), "City state name");
  }

  private void validateBirthDate(Date birthDate) {
    if (birthDate == null) throw new ValidationException("Birth date is required");
    Date from = Tools.getRelativeDate(-100, 0, 0);
    Date to = Tools.getRelativeDate(-12, 0, 0);
    if (birthDate.before(from) || birthDate.after(to))
      throw new ValidationException("Birth date is not valid");
  }

  private void validateEmail(String email) {
    if (email == null || email.isEmpty()) throw new ValidationException("Email is required");
    if (!matches(EMAIL, email)) throw new ValidationException("Email is not valid");
  }

  private void validatePhone(String phone) {
    if (phone == null || phone.isEmpty()) throw new ValidationException("Phone is required");
    if (!matches(PHONE, phone)) throw new ValidationException("Phone is not valid");
  }

  private void validateUsername(String username) {
    if (username == null || username.isEmpty())
      throw new ValidationException("Username is required");
    if (!matches(USERNAME, username)) throw new ValidationException("Username is not valid");
  }

  private void validatePassword(String password) {
    if (password == null || password.isEmpty())
      throw new ValidationException("Password is required");
    if (!matches(PASSWORD, password)) throw new ValidationException("Password is not valid");
  }

  public Person findById(Long id) {
    return this.personRepository
        .findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Person not found"));
  }

  public List<Person> findAll() {
    return this.personRepository.findAll();
  }

  public void delete(Long id) {
    var person =
        this.personRepository
            .findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Person not found"));
    this.personRepository.delete(person);
  }
}
