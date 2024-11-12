package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.LoginDTO.LoginDTO;
import org.example.finalworkapi.Domain.Entities.Mechanic;
import org.springframework.stereotype.Component;

@Component
public class MechanicMapper {

    //Add mechanic
    public Mechanic toEntity(LoginDTO dto) {
        Mechanic mechanic = new Mechanic();
        mechanic.setEmail(dto.getEmail());
        mechanic.setPassword(dto.getPassword());
        return mechanic;
    }

}
