package org.calderon.tallerweb.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ciudades")
public class City {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nombre", nullable = false)
  private String name;

  @Column(name = "estado", nullable = false)
  private String state;

  @Column(name = "pais", nullable = false)
  private String country;

  @Column(name = "descripcion")
  private String description;
}
