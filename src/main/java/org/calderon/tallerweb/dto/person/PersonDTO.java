package org.calderon.tallerweb.dto.person;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Date;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {
  private Long id;

  @NotBlank private String name;

  @NotBlank
  @JsonAlias("last_name")
  private String lastName;

  @NotNull @Valid private DocumentDTO document;

  @NotNull @Valid private CityDTO city;

  @NotNull
  @JsonAlias("dob")
  private Date birthDate;

  @NotNull private String email;

  @NotBlank private String phone;

  @NotBlank private String username;

  @NotBlank private String password;
}
