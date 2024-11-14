package org.example.finalworkapi.Application.ApplicationServices;

import jakarta.persistence.EntityNotFoundException;
import org.example.finalworkapi.Application.DTOs.MechanicDTO.MaintenanceMechanicDTO;
import org.example.finalworkapi.Application.Mappers.LogicMappers.MaintenanceMechanicMapper;
import org.example.finalworkapi.Domain.Entities.Maintenance;
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

    //List mechanic
    public List<MaintenanceMechanicDTO> getAllMaintenanceMechanic() {
        List<Maintenance> maintenanceList = maintenanceService.getAllMaintenanceMechanic();
        return maintenanceList.stream()
                .map(maintenanceMapper::toDTO)
                .collect(Collectors.toList());
    }

    //Update description "inactivo"
    public MaintenanceMechanicDTO finalizeMaintenance(int maintenanceId) {
        Maintenance maintenance = maintenanceService.finalizeMaintenance(maintenanceId);

        if (maintenance == null) {
            throw new EntityNotFoundException("No se encontró el mantenimiento con id " + maintenanceId);
        } else {
            System.out.println("El mantenimiento encontrado tiene el id: " + maintenance.getIdMaintenance());
        }


        return maintenanceMapper.toDTO(maintenance);
    }
}
