package org.calderon.tallerweb.dto.person;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CityDTO {
  private Long id;
  @NotBlank private String name;
  @NotBlank private String state;
  @NotBlank private String country;
  private String description;
}
