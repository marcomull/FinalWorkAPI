package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.JobDTO.AddJobDTO;
import org.example.finalworkapi.Application.DTOs.RequestSparePartDTO.AddSparePartDTO;
import org.example.finalworkapi.Application.DTOs.RequestSparePartDTO.ListSparePartDTO;
import org.example.finalworkapi.Domain.Entities.*;
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

    //Add request spare part
    public SparePart toEntity(AddSparePartDTO dto) {
        SparePart sparePart = new SparePart();
        sparePart.setIdMechanic(new Mechanic(dto.getMechanic()));
        sparePart.setIdLogistics(new Logistics(dto.getLogistics()));
        sparePart.setArrivalDate(dto.getArrivalDate());
        sparePart.setSparePart(dto.getSparePart());
        return sparePart;
    }

}
