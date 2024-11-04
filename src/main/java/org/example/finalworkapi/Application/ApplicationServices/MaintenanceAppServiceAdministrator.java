package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.MaintenanceDTO.AddMaintenanceAdminDTO;
import org.example.finalworkapi.Application.DTOs.MaintenanceDTO.ListMaintenanceAdminDTO;
import org.example.finalworkapi.Application.DTOs.MaintenanceDTO.UpdateMaintenanceDTO;
import org.example.finalworkapi.Application.Mappers.MaintenanceAdministratorMapper;
import org.example.finalworkapi.Domain.Entities.Maintenance;
import org.example.finalworkapi.Domain.InterfaceService.IMaintenanceAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


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
        List<Maintenance> maintenanceList = maintenanceService.getAllMaintenanceDetails();
        try {
            return maintenanceList.stream()
                    .map(maintenanceMapper::toDTO)
                    .collect(Collectors.toList());
        } catch (ClassCastException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    //Add maintenance
    public Maintenance addMaintenance(AddMaintenanceAdminDTO dto) {
        Maintenance maintenance = maintenanceMapper.toEntity(dto);
        return maintenanceService.addMaintenance(maintenance);
    }

    //Update maintenance
    public Optional<Maintenance> updateMaintenance(int id, UpdateMaintenanceDTO dto) {
        return maintenanceService.updateMaintenance(id, maintenanceMapper.updateEntity(dto));
    }

    //Delete maintenance
    public boolean deleteMaintenance(ListMaintenanceAdminDTO deleteDTO) {
        Maintenance maintenanceToDelete = maintenanceMapper.toEntityForDeletion(deleteDTO);
        return maintenanceService.deleteMaintenanceById(maintenanceToDelete.getIdMaintenance());
    }

    //Buscar maintenance


}