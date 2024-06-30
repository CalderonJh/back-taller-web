package org.calderon.tallerweb.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "Person", description = "Endpoints to manage persons information")
public class PersonController {
  private PersonServiceImpl personService;

  @PatchMapping("/update")
  @Operation(
      summary = "Update person information, Id is required for update",
      requestBody =
          @io.swagger.v3.oas.annotations.parameters.RequestBody(
              required = true,
              content =
                  @Content(
                      mediaType = "application/json",
                      schema =
                          @Schema(implementation = PersonPatchDTO.class, name = "PersonPatchDTO"),
                      examples = {
                        @ExampleObject(
                            name = "PersonPatchDTO",
                            description = "You have to define just the fields you want to update",
                            value =
                                """
                                {
                                  "id": 2,
                                  "city": {
                                    "name": "Bucaramanga"
                                  }
                                }""")
                      })),
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Person updated successfully",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = PersonDTO.class, name = "PersonDTO")))
      })
  public ResponseEntity<PersonDTO> updatePerson(@RequestBody @Valid PersonPatchDTO dto) {
    var personDB = this.personService.update(dto);
    return ResponseEntity.ok(PersonMapper.INSTANCE.toResponseDTO(personDB));
  }

  @PostMapping("/save")
  @Operation(
      summary = "Create a new person",
      description = "Create a new person with the information provided",
      requestBody =
          @io.swagger.v3.oas.annotations.parameters.RequestBody(
              required = true,
              content =
                  @Content(
                      mediaType = "application/json",
                      schema = @Schema(implementation = PersonDTO.class, name = "PersonDTO"))),
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Person created successfully",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = PersonDTO.class, name = "PersonDTO")))
      })
  public ResponseEntity<PersonDTO> savePerson(@RequestBody @Valid PersonDTO personDTO) {
    var personDB = this.personService.save(PersonMapper.INSTANCE.toEntity(personDTO));
    return ResponseEntity.ok(PersonMapper.INSTANCE.toResponseDTO(personDB));
  }

  @GetMapping("/{id}")
  @Operation(
      summary = "Get person information",
      description = "Get person information by id",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Person information",
            content =
                @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = PersonDTO.class, name = "PersonDTO")))
      })
  public ResponseEntity<PersonDTO> getPerson(@PathVariable Long id) {
    var personDB = this.personService.getPerson(id);
    return ResponseEntity.ok(PersonMapper.INSTANCE.toResponseDTO(personDB));
  }

  @GetMapping("/all")
  @Operation(
      summary = "Get getAll persons",
      description = "Get getAll persons information",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "All persons information",
            content =
                @Content(
                    mediaType = "application/json",
                    array = @ArraySchema(schema = @Schema(implementation = PersonDTO.class))))
      })
  public ResponseEntity<List<PersonDTO>> getAll() {
    return ResponseEntity.ok(PersonMapper.INSTANCE.toResponseDTOList(this.personService.getAll()));
  }

  @DeleteMapping("/{id}")
  @Operation(
      summary = "Delete person",
      description = "Delete person by id",
      responses = {
        @ApiResponse(
            responseCode = "204",
            description = "Person deleted successfully",
            content = @Content)
      })
  public ResponseEntity<Void> deletePerson(@PathVariable Long id) {
    this.personService.delete(id);
    return ResponseEntity.noContent().build();
  }

  @Autowired
  public void setPersonService(PersonServiceImpl personService) {
    this.personService = personService;
  }
}
