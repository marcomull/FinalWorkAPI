package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.SparePartDTO.SparePartDTO;
import org.example.finalworkapi.Domain.Entities.*;
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

    //Add spare part
    public SparePart toEntity(SparePartDTO dto) {
        SparePart sparePart = new SparePart();
        sparePart.setIdSparePart(dto.getIdSparePart());
        sparePart.setSparePart(dto.getSparePart());
        sparePart.setStock(dto.getStock());
        sparePart.setPrice(dto.getPrice());
        return sparePart;
    }

    //Update repuesto
    public SparePart updateEntity(SparePartDTO dto) {
        SparePart sparePart = new SparePart();
        sparePart.setSparePart(dto.getSparePart());
        sparePart.setStock(dto.getStock());
        sparePart.setPrice(dto.getPrice());
        return sparePart;
    }

    //Delete repuesto
    public SparePart toEntityForDeletion(SparePartDTO dto) {
        SparePart sparePart = new SparePart();
        sparePart.setIdSparePart(dto.getIdSparePart());
        return sparePart;
    }

}
