package org.example.finalworkapi.Application.Mappers.LoginMappers;

import org.example.finalworkapi.Application.DTOs.LoginDTO.LoginDTO;
import org.example.finalworkapi.Domain.Entities.Administrator;
import org.example.finalworkapi.Domain.Entities.Logistics;
import org.example.finalworkapi.Domain.Entities.Mechanic;
import org.springframework.stereotype.Component;

@Component
public class LoginMappers {

    // Mapeo de Administrator a UserDTO
    public LoginDTO toDTO(Administrator administrator) {
        LoginDTO dto = new LoginDTO();
        dto.setId(administrator.getIdAdministrator());
        dto.setEmail(administrator.getEmail());
        dto.setPassword(administrator.getPassword());
        return dto;
    }

    // Mapeo de Logistics a UserDTO
    public LoginDTO toDTO(Logistics logistics) {
        LoginDTO dto = new LoginDTO();
        dto.setId(logistics.getIdLogistics());
        dto.setEmail(logistics.getEmail());
        dto.setPassword(logistics.getPassword());
        return dto;
    }

    // Mapeo de Mechanic a UserDTO
    public LoginDTO toDTO(Mechanic mechanic) {
        LoginDTO dto = new LoginDTO();
        dto.setId(mechanic.getIdMechanic());
        dto.setEmail(mechanic.getEmail());
        dto.setPassword(mechanic.getPassword());
        return dto;
    }
}

