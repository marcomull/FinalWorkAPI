package org.example.finalworkapi.Application.Mappers.LoginMappers;

import org.example.finalworkapi.Application.DTOs.LoginDTO.UserDTO;
import org.example.finalworkapi.Domain.Entities.Administrator;
import org.example.finalworkapi.Domain.Entities.Logistics;
import org.example.finalworkapi.Domain.Entities.Mechanic;

public class UserMappers {

    public static UserDTO toDTO(Administrator administrator) {
        UserDTO dto = new UserDTO();
        dto.setId(administrator.getIdAdministrator());
        dto.setEmail(administrator.getEmail());
        dto.setPassword(administrator.getPassword());
        return dto;
    }

    public static UserDTO toDTO(Logistics logistics) {
        UserDTO dto = new UserDTO();
        dto.setId(logistics.getIdLogistics());
        dto.setEmail(logistics.getEmail());
        dto.setPassword(logistics.getPassword());
        return dto;
    }

    public static UserDTO toDTO(Mechanic mechanic) {
        UserDTO dto = new UserDTO();
        dto.setId(mechanic.getIdMechanic());
        dto.setEmail(mechanic.getEmail());
        dto.setPassword(mechanic.getPassword());
        return dto;
    }
}
