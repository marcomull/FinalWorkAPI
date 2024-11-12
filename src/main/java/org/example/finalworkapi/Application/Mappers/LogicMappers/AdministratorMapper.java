package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.AdministratorDTO.ListAdministratorDTO;
import org.example.finalworkapi.Application.DTOs.LoginDTO.LoginDTO;
import org.example.finalworkapi.Domain.Entities.Administrator;
import org.springframework.stereotype.Component;

@Component
public class AdministratorMapper {

    //List administrator
    public ListAdministratorDTO toDTO(Administrator administrator) {
        ListAdministratorDTO dto = new ListAdministratorDTO();
        dto.setId(administrator.getIdAdministrator());
        dto.setEmail(administrator.getEmail());
        return dto;
    }

    //Add Administrator
    public Administrator toEntity(LoginDTO dto) {
        Administrator administrator = new Administrator();
        administrator.setEmail(dto.getEmail());
        administrator.setPassword(dto.getPassword());
        return administrator;
    }
}
