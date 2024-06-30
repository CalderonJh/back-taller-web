package org.calderon.tallerweb.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import java.util.Date;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "personas")
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nombre", nullable = false)
  private String name;

  @Column(name = "apellido", nullable = false)
  private String lastName;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id_documento", nullable = false)
  private Document document;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id_ciudad", nullable = false)
  private City city;

  @Column(name = "fecha_nacimiento", nullable = false)
  private Date birthDate;

  @Column(name = "email", nullable = false)
  @Email(message = "Email should be valid")
  private String email;

  @Column(name = "telefono", nullable = false)
  private String phone;

  @Column(name = "username", nullable = false)
  private String username;

  @Column(name = "password", nullable = false)
  private String password;
}
