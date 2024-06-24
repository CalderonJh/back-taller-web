package org.calderon.tallerweb.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ciudades", schema = "personas")
public class City {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nombre")
  private String name;

  @Column(name = "estado")
  private String state;

  @Column(name = "pais")
  private String country;

  @Column(name = "descripcion")
  private String description;
}
