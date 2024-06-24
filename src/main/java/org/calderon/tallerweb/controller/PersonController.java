package org.calderon.tallerweb.controller;


import jakarta.validation.Valid;
import org.calderon.tallerweb.dto.person.PersonDTO;
import org.calderon.tallerweb.mapper.PersonMapper;
import org.calderon.tallerweb.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
  private PersonServiceImpl personService;

  @PostMapping("/save")
  public ResponseEntity<PersonDTO> savePerson(@RequestBody @Valid PersonDTO personDTO) {
    var personDB = this.personService.savePerson(PersonMapper.INSTANCE.toEntity(personDTO));
    return ResponseEntity.ok(PersonMapper.INSTANCE.toResponseDTO(personDB));
  }

  @Autowired
  public void setPersonService(PersonServiceImpl personService) {
    this.personService = personService;
  }
}
