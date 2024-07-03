package org.calderon.tallerweb.dto.person;

import com.fasterxml.jackson.annotation.JsonAlias;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Date;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "PersonDTO", description = "DTO to create a person and get person information")
public class PersonDTO {
  @Schema(description = "For reading purposes", example = "1")
  private Long id;

  @Schema(description = "Person name", example = "Jhon")
  @NotBlank
  private String name;

  @NotBlank
  @JsonAlias("last_name")
  @Schema(description = "Person last name", example = "Calderón")
  private String lastName;

  @Schema(description = "Person document", implementation = DocumentDTO.class)
  @NotNull
  @Valid
  private DocumentDTO document;

  @Schema(description = "Person city", implementation = CityDTO.class)
  @NotNull
  @Valid
  private CityDTO city;

  @NotNull
  @JsonAlias("dob")
  @Schema(description = "Person birth date", name = "dob", example = "2001-12-19")
  private Date birthDate;

  @Schema(description = "Person email", example = "jhon@email.com")
  @NotBlank
  private String email;

  @Schema(description = "Person phone", example = "1234567890")
  @NotBlank
  private String phone;

  @Schema(description = "Person username", example = "jhoncalderon123")
  @NotBlank
  private String username;

  @Schema(description = "Person password", example = "HelloWorld123!")
  @NotBlank
  private String password;
}
