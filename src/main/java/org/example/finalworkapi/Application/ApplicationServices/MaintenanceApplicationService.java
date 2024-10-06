package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.MaintenanceDTO;
import org.example.finalworkapi.Application.Mappers.MaintenanceMapper;
import org.example.finalworkapi.Domain.DomainServices.MaintenanceService;
import org.example.finalworkapi.Domain.Entities.Maintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MaintenanceApplicationService {

    private final MaintenanceService maintenanceService;
    private final MaintenanceMapper maintenanceMapper;

    /*@Autowired
    public MaintenanceApplicationService(MaintenanceService maintenanceService, MaintenanceMapper maintenanceMapper) {
        this.maintenanceService = maintenanceService;
        this.maintenanceMapper = maintenanceMapper;
    }

    public List<MaintenanceDTO> getAllMaintenanceDetails() {
        // Obtén las entidades desde la capa de servicio de dominio
        List<Maintenance> maintenanceList = maintenanceService.getAllMaintenance();

        // Convierte las entidades a DTOs usando el Mapper
        return maintenanceList.stream()
                .map(maintenanceMapper::toDTO)
                .collect(Collectors.toList());
    }*/

    @Autowired
    public MaintenanceApplicationService(MaintenanceService maintenanceService, MaintenanceMapper maintenanceMapper) {
        this.maintenanceService = maintenanceService;
        this.maintenanceMapper = maintenanceMapper;
    }

    public List<MaintenanceDTO> getAllMaintenanceDetails() {
        // Obtén los detalles desde la capa de servicio de dominio
        List<Object[]> maintenanceList = maintenanceService.getAllMaintenanceDetails();

        // Convierte las entidades a DTOs usando el Mapper
        return maintenanceList.stream()
                .map(maintenanceMapper::toDTO) // Necesitarás ajustar esto
                .collect(Collectors.toList());
    }
}
