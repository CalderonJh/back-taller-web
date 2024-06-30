package org.calderon.tallerweb.dto.person;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Date;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonPatchDTO {
  @NotNull(message = "Id is required for update")
  private Long id;

  private String name;

  @JsonAlias("last_name")
  private String lastName;

  @Valid private DocumentDTO document;

  @Valid private CityDTO city;

  @JsonAlias("dob")
  private Date birthDate;

  private String email;

  private String phone;

  private String username;

  private String password;
}
