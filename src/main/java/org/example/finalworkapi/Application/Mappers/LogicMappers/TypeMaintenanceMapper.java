package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.TypeMaintenanceDTO.ListTypeMaintenanceDTO;
import org.example.finalworkapi.Application.DTOs.VehicleDTO.VehicleDTO;
import org.example.finalworkapi.Domain.Entities.TypeMaintenance;
import org.example.finalworkapi.Domain.Entities.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class TypeMaintenanceMapper {

    //List vehicle
    public ListTypeMaintenanceDTO toDTO(TypeMaintenance typeMaintenance) {
        ListTypeMaintenanceDTO dto = new ListTypeMaintenanceDTO();
        dto.setIdTypeMaintenance(typeMaintenance.getIdTypeMaintenance());
        dto.setNameType(typeMaintenance.getNameType());
        dto.setDescription(typeMaintenance.getDescription());
        return dto;
    }

}
