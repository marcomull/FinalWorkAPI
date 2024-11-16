package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.SparePartDTO.ListSparePartDTO;
import org.example.finalworkapi.Domain.Entities.SparePart;
import org.springframework.stereotype.Component;

@Component
public class SparePartMapper {

    //List spare part
    public ListSparePartDTO toDTO(SparePart sparePart) {
        ListSparePartDTO dto = new ListSparePartDTO();
        dto.setIdSparePart(sparePart.getIdSparePart());
        dto.setArrivalDate(sparePart.getArrivalDate());
        dto.setSparePart(sparePart.getSparePart());
        dto.setMechanic(sparePart.getIdMechanic().getEmail());
        dto.setQuantity(sparePart.getQuantity());
        return dto;
    }

}
