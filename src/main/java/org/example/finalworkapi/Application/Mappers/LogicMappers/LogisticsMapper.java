package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.LoginDTO.LoginDTO;
import org.example.finalworkapi.Domain.Entities.Logistics;
import org.springframework.stereotype.Component;

@Component
public class LogisticsMapper {

    //Add Logistics
    public Logistics toEntity(LoginDTO dto) {
        Logistics logistic = new Logistics();
        logistic.setEmail(dto.getEmail());
        logistic.setPassword(dto.getPassword());
        return logistic;
    }
}
