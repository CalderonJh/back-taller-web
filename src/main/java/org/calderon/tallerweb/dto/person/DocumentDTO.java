package org.calderon.tallerweb.dto.person;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "DocumentDTO", description = "DTO to create a document and get document information")
public class DocumentDTO {
  @Schema(description = "For reading purposes", example = "1")
  private Long id;

  @Schema(description = "Document type", example = "CC")
  @NotBlank
  private String type;

  @Schema(description = "Document number", example = "1234567890")
  @NotBlank
  private String number;

  @Schema(description = "Document description", example = "Colombian citizen card")
  private String description;
}
