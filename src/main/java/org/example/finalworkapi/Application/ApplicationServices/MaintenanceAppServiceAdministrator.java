package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.AddMaintenanceAdminDTO;
import org.example.finalworkapi.Application.DTOs.ListMaintenanceAdminDTO;
import org.example.finalworkapi.Application.Mappers.MaintenanceAdministratorMapper;
import org.example.finalworkapi.Domain.Entities.Maintenance;
import org.example.finalworkapi.Domain.InterfaceService.IMaintenanceAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;


@Service
public class MaintenanceAppServiceAdministrator {

    private final IMaintenanceAdministratorService maintenanceService;
    private final MaintenanceAdministratorMapper maintenanceMapper;

    @Autowired
    public MaintenanceAppServiceAdministrator(IMaintenanceAdministratorService maintenanceService, MaintenanceAdministratorMapper maintenanceMapper) {
        this.maintenanceService = maintenanceService;
        this.maintenanceMapper = maintenanceMapper;
    }

    //List maintenance
    public List<ListMaintenanceAdminDTO> getAllMaintenanceDetails() {
        List<Object[]> maintenanceList = maintenanceService.getAllMaintenanceDetails();

        return maintenanceList.stream()
                .map(maintenanceMapper::toDTO)
                .collect(Collectors.toList());
    }

    //Add maintenance
    public Maintenance addMaintenance(AddMaintenanceAdminDTO dto) {
        Maintenance maintenance = maintenanceMapper.toEntity(dto);
        return maintenanceService.addMaintenance(maintenance);
    }

    //Update maintenance
    public Optional<Maintenance> updateMaintenance(int id, AddMaintenanceAdminDTO dto) {
        return maintenanceService.updateMaintenance(id, maintenanceMapper.toEntity(dto));
    }

}