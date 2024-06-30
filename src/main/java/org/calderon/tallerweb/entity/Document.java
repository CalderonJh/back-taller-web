package org.calderon.tallerweb.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "documentos")
public class Document {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "tipo", nullable = false)
  private String type;

  @Column(name = "numero", nullable = false)
  private String number;

  @Column(name = "descripcion")
  private String description;
}
