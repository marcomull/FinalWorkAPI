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
    public ListMaintenanceAdminDTO toDTO(Maintenance maintenance) {
        ListMaintenanceAdminDTO dto = new ListMaintenanceAdminDTO();
        dto.setIdMaintenance(maintenance.getIdMaintenance());
        dto.setMileage(maintenance.getVehicle().getMileage());
        dto.setPlate(maintenance.getVehicle().getPlate());
        dto.setBrand(maintenance.getVehicle().getBrand());
        dto.setModel(maintenance.getVehicle().getModel());
        dto.setYearManufacture(maintenance.getVehicle().getYearManufacture());
        dto.setMaintenancePlan(maintenance.getVehicle().getMaintenancePlan());
        dto.setNameType(maintenance.getTypeMaintenance().getNameType());
        dto.setDescriptionReport(maintenance.getFailureReport().getDescriptionReport());
        dto.setDateMaintenance(maintenance.getDateMaintenance());
        dto.setDescriptions(maintenance.getDescriptions());
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
