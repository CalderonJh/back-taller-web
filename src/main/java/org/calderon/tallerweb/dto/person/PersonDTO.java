package org.calderon.tallerweb.dto.person;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
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

  @NotBlank private String lastName;

  @NotNull @Valid private DocumentDTO document;

  @NotNull @Valid private CityDTO city;

  @NotNull private Date birthDate;

  @Email private String email;

  @NotBlank private String phone;

  @NotBlank private String username;

  @NotBlank private String password;
}
