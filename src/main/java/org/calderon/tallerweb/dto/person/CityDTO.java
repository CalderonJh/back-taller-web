package org.calderon.tallerweb.dto.person;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "CityDTO", description = "DTO to create a city and get city information")
public class CityDTO {
  @Schema(description = "For reading purposes", example = "1")
  private Long id;

  @Schema(description = "City name", example = "Bucaramanga")
  @NotBlank
  private String name;

  @Schema(description = "City state", example = "Santander")
  @NotBlank
  private String state;

  @Schema(description = "City country", example = "Colombia")
  @NotBlank
  private String country;

  @Schema(description = "City description", example = "The city of parks, ole mano")
  private String description;
}
