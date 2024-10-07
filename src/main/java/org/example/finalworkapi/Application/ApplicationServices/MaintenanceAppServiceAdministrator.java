package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.MaintenanceAdministratorDTO;
import org.example.finalworkapi.Application.Mappers.MaintenanceAdministratorMapper;
import org.example.finalworkapi.Domain.DomainServices.MaintenanceAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MaintenanceAppServiceAdministrator {

    private final MaintenanceAdministratorService maintenanceService;
    private final MaintenanceAdministratorMapper maintenanceMapper;

    @Autowired
    public MaintenanceAppServiceAdministrator(MaintenanceAdministratorService maintenanceService, MaintenanceAdministratorMapper maintenanceMapper) {
        this.maintenanceService = maintenanceService;
        this.maintenanceMapper = maintenanceMapper;
    }

    public List<MaintenanceAdministratorDTO> getAllMaintenanceDetails() {
        List<Object[]> maintenanceList = maintenanceService.getAllMaintenanceDetails();

        return maintenanceList.stream()
                .map(maintenanceMapper::toDTO) // Necesitarás ajustar esto
                .collect(Collectors.toList());
    }

}
