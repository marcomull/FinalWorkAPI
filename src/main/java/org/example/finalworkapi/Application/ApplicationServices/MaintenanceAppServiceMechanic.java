package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.MaintenanceMechanicDTO;
import org.example.finalworkapi.Application.Mappers.MaintenanceMechanicMapper;
import org.example.finalworkapi.Domain.DomainServices.MaintenanceMechanicService;
import org.example.finalworkapi.Domain.InterfaceService.IMaintenanceMechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MaintenanceAppServiceMechanic {

    private final IMaintenanceMechanicService maintenanceService;
    private final MaintenanceMechanicMapper maintenanceMapper;

    @Autowired
    public MaintenanceAppServiceMechanic(IMaintenanceMechanicService maintenanceService, MaintenanceMechanicMapper maintenanceMapper) {
        this.maintenanceService = maintenanceService;
        this.maintenanceMapper = maintenanceMapper;
    }

    public List<MaintenanceMechanicDTO> getAllMaintenanceMechanic() {
        List<Object[]> maintenanceList = maintenanceService.getAllMaintenanceMechanic();

        return maintenanceList.stream()
                .map(maintenanceMapper::toDTO)
                .collect(Collectors.toList());
    }

}
