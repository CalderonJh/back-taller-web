package org.calderon.tallerweb.controller;

import jakarta.validation.Valid;
import java.util.List;
import org.calderon.tallerweb.dto.person.PersonDTO;
import org.calderon.tallerweb.dto.person.PersonPatchDTO;
import org.calderon.tallerweb.mapper.PersonMapper;
import org.calderon.tallerweb.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
  private PersonServiceImpl personService;

  @PostMapping("/save")
  public ResponseEntity<PersonDTO> savePerson(@RequestBody @Valid PersonDTO personDTO) {
    var personDB = this.personService.save(PersonMapper.INSTANCE.toEntity(personDTO));
    return ResponseEntity.ok(PersonMapper.INSTANCE.toResponseDTO(personDB));
  }

  @GetMapping("/{id}")
  public ResponseEntity<PersonDTO> getPerson(@PathVariable Long id) {
    var personDB = this.personService.findById(id);
    return ResponseEntity.ok(PersonMapper.INSTANCE.toResponseDTO(personDB));
  }

  @GetMapping("/all")
  public ResponseEntity<List<PersonDTO>> getAll() {
    return ResponseEntity.ok(PersonMapper.INSTANCE.toResponseDTOList(this.personService.findAll()));
  }

  @PatchMapping("/update")
  public ResponseEntity<PersonDTO> updatePerson(@RequestBody @Valid PersonPatchDTO dto) {
    var personDB = this.personService.update(dto);
    return ResponseEntity.ok(PersonMapper.INSTANCE.toResponseDTO(personDB));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deletePerson(@PathVariable Long id) {
    this.personService.delete(id);
    return ResponseEntity.noContent().build();
  }

  @Autowired
  public void setPersonService(PersonServiceImpl personService) {
    this.personService = personService;
  }
}
