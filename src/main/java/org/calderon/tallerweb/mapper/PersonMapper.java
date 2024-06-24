package org.calderon.tallerweb.mapper;

import org.calderon.tallerweb.dto.person.CityDTO;
import org.calderon.tallerweb.dto.person.DocumentDTO;
import org.calderon.tallerweb.dto.person.PersonDTO;
import org.calderon.tallerweb.entity.City;
import org.calderon.tallerweb.entity.Document;
import org.calderon.tallerweb.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
  PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

  @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
  @Mapping(target = "id", ignore = true)
  Person toEntity(PersonDTO person);

  PersonDTO toResponseDTO(Person person);

  @Mapping(target = "id", ignore = true)
  Document toDocument(DocumentDTO documentDTO);

  @Mapping(target = "id", ignore = true)
  City toCity(CityDTO cityDTO);

  DocumentDTO toDocumentDTO(Document document);

  CityDTO toCityDTO(City city);
}
