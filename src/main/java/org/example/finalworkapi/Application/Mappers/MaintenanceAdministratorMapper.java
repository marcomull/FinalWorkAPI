package org.example.finalworkapi.Application.Mappers;

import org.example.finalworkapi.Application.DTOs.MaintenanceDTO.AddMaintenanceAdminDTO;
import org.example.finalworkapi.Application.DTOs.MaintenanceDTO.ListMaintenanceAdminDTO;
import org.example.finalworkapi.Application.DTOs.MaintenanceDTO.SearchMaintenanceDTO;
import org.example.finalworkapi.Application.DTOs.MaintenanceDTO.UpdateMaintenanceDTO;
import org.example.finalworkapi.Domain.Entities.*;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class MaintenanceAdministratorMapper {

    //List maintenance
    public ListMaintenanceAdminDTO toDTO(Object[] maintenanceData) {
        ListMaintenanceAdminDTO dto = new ListMaintenanceAdminDTO();
        dto.setIdMaintenance((Integer) maintenanceData[0]);
        dto.setMileage((Integer) maintenanceData[1]);
        dto.setPlate((String) maintenanceData[2]);
        dto.setBrand((String) maintenanceData[3]);
        dto.setModel((String) maintenanceData[4]);
        dto.setYearManufacture((Date) maintenanceData[5]);
        dto.setMaintenancePlan((String) maintenanceData[6]);
        dto.setNameType((String) maintenanceData[7]);
        dto.setDescriptionReport((String) maintenanceData[8]);
        dto.setDateMaintenance((Date) maintenanceData[9]);
        dto.setDescriptions((String) maintenanceData[10]);
        return dto;
    }

    //Add maintenance
    public Maintenance toEntity(AddMaintenanceAdminDTO dto) {
        Maintenance maintenance = new Maintenance();
        maintenance.setVehicle(new Vehicle(dto.getVehicleId()));
        maintenance.setAdministrator(new Administrator(dto.getAdministratorId()));
        maintenance.setTypeMaintenance(new TypeMaintenance(dto.getTypeMaintenanceId()));
        maintenance.setFailureReport(new FailureReport(dto.getFailureReportId()));
        maintenance.setDateMaintenance(dto.getDateMaintenance());
        maintenance.setDescriptions(dto.getDescriptions());
        return maintenance;
    }

    //Update maintenance
    public Maintenance updateEntity(UpdateMaintenanceDTO dto) {
        Maintenance maintenance = new Maintenance();
        maintenance.setVehicle(new Vehicle(dto.getVehicleId()));
        maintenance.setAdministrator(new Administrator(dto.getAdministratorId()));
        maintenance.setTypeMaintenance(new TypeMaintenance(dto.getTypeMaintenanceId()));
        maintenance.setFailureReport(new FailureReport(dto.getFailureReportId()));
        maintenance.setDateMaintenance(dto.getDateMaintenance());
        maintenance.setDescriptions(dto.getDescriptions());
        return maintenance;
    }

    //Delete maintenance
    public Maintenance toEntityForDeletion(ListMaintenanceAdminDTO dto) {
        Maintenance maintenance = new Maintenance();
        maintenance.setIdMaintenance(dto.getIdMaintenance());
        return maintenance;
    }

    //Buscar maintenance
    public Maintenance toSearchEntity(SearchMaintenanceDTO dto) {
        Maintenance maintenance = new Maintenance();
        maintenance.setIdMaintenance(dto.getMaintenanceId());
        maintenance.setFailureReport(new FailureReport(dto.getFailureReportId()));
        maintenance.setVehicle(new Vehicle(dto.getVehicleId()));
        maintenance.setAdministrator(new Administrator(dto.getAdministratorId()));
        maintenance.setTypeMaintenance(new TypeMaintenance(dto.getTypeMaintenanceId()));
        return maintenance;
    }
}
