package org.calderon.tallerweb.dto.person;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDTO {
  private Long id;
  @NotBlank private String type;
  @NotBlank private String number;
  private String description;
}
