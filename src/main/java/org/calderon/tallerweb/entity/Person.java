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
@Table(name = "personas", schema = "personas")
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nombre_completo")
  private String fullName;

  @Column(name = "apellido")
  private String lastName;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id_tipo_documento")
  private DocumentType documentType;

  @Column(name = "numero_documento")
  private String documentNumber;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id_ciudad")
  private City city;

  @Column(name = "fecha_nacimiento")
  private Date birthDate;

  @Column(name = "email")
  @Email(message = "Email should be valid")
  private String email;

  @Column(name = "telefono")
  private String phone;

  @Column(name = "username")
  private String username;

  @Column(name = "password")
  private String password;
}