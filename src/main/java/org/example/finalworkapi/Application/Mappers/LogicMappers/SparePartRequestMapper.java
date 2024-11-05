package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.LogisticsDTO.SparePartRequestDTO;

import java.util.Date;

public class SparePartRequestMapper {

    public SparePartRequestDTO toDTO(Object[] maintenanceData) {
        SparePartRequestDTO dto = new SparePartRequestDTO();
        dto.setIdSparePart((Integer) maintenanceData[0]);
        dto.setArrivalDate((Date) maintenanceData[1]);
        dto.setSparePart((String) maintenanceData[2]);
        dto.setQuantity((Integer) maintenanceData[3]);
        return dto;
    }


}
