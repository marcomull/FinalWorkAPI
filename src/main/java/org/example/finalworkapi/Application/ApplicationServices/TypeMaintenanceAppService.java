package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.TypeMaintenanceDTO.ListTypeMaintenanceDTO;
import org.example.finalworkapi.Application.Mappers.LogicMappers.TypeMaintenanceMapper;
import org.example.finalworkapi.Domain.Entities.TypeMaintenance;
import org.example.finalworkapi.Domain.InterfaceService.ITypeMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TypeMaintenanceAppService {

    private final ITypeMaintenanceService typeMaintenanceService;
    private final TypeMaintenanceMapper typeMaintenanceMapper;

    @Autowired
    public TypeMaintenanceAppService(ITypeMaintenanceService typeMaintenanceService, TypeMaintenanceMapper typeMaintenanceMapper) {
        this.typeMaintenanceService = typeMaintenanceService;
        this.typeMaintenanceMapper = typeMaintenanceMapper;
    }

    //List Type maintenance
    public List<ListTypeMaintenanceDTO> getAllTypeMaintenances() {
        List<TypeMaintenance> typeMaintenancesList = typeMaintenanceService.getAllTypeMaintenance();
        try {
            return typeMaintenancesList.stream()
                    .map(typeMaintenanceMapper::toDTO)
                    .collect(Collectors.toList());
        } catch (ClassCastException e) {
            return Collections.emptyList();
        }
    }
}
