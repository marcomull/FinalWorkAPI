package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.SparePartDTO.SparePartDTO;
import org.example.finalworkapi.Domain.Entities.SparePart;
import org.springframework.stereotype.Component;

@Component
public class SparePartMapper {

    //Listar repuestos
    public SparePartDTO toDTO(SparePart sparePart) {
        SparePartDTO dto = new SparePartDTO();
        dto.setIdSparePart(sparePart.getIdSparePart());
        dto.setSparePart(sparePart.getSparePart());
        dto.setStock(sparePart.getStock());
        dto.setPrice(sparePart.getPrice());
        return dto;
    }

}
