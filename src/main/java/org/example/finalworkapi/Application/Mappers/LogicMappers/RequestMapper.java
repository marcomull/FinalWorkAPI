package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.RequestDTO.AddRequestDTO;
import org.example.finalworkapi.Application.DTOs.RequestDTO.ListRequestDTO;
import org.example.finalworkapi.Domain.Entities.Logistics;
import org.example.finalworkapi.Domain.Entities.Mechanic;
import org.example.finalworkapi.Domain.Entities.Request;
import org.springframework.stereotype.Component;

@Component
public class RequestMapper {

    //List spare part
    public ListRequestDTO toDTO(Request request) {
        ListRequestDTO dto = new ListRequestDTO();
        dto.setIdRequest(request.getIdRequest());
        dto.setMechanic(request.getIdMechanic().getEmail());
        dto.setLogistics(request.getIdLogistics() != null ? request.getIdLogistics().getEmail() : "No asignado");
        dto.setRequestDate(request.getRequestDate());
        dto.setDescription(request.getDescription());
        dto.setState(request.getState());
        return dto;
    }

    //Add request spare part
    public Request toEntity(AddRequestDTO dto) {
        Request request = new Request();
        request.setIdRequest(dto.getIdRequest());
        request.setIdMechanic(new Mechanic(dto.getIdMechanic()));
        request.setRequestDate(dto.getRequestDate());
        request.setDescription(dto.getDescription());
        request.setState(dto.getState());
        return request;
    }

}
