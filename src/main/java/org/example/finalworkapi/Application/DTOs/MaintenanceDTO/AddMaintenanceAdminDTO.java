package org.example.finalworkapi.Application.DTOs.MaintenanceDTO;

import java.util.Date;

public class AddMaintenanceAdminDTO {
    private int vehicleId;
    private int administratorId;
    private int typeMaintenanceId;
    private int failureReportId;
    private Date dateMaintenance;
    private String descriptions;

    public AddMaintenanceAdminDTO(int vehicleId, int administratorId, int typeMaintenanceId, int failureReportId, Date dateMaintenance, String descriptions) {
        this.vehicleId = vehicleId;
        this.administratorId = administratorId;
        this.typeMaintenanceId = typeMaintenanceId;
        this.failureReportId = failureReportId;
        this.dateMaintenance = dateMaintenance;
        this.descriptions = descriptions;
    }

    public AddMaintenanceAdminDTO() {}

    public int getVehicleId() {
        return vehicleId;
    }

    public int getAdministratorId() {
        return administratorId;
    }

    public int getTypeMaintenanceId() {
        return typeMaintenanceId;
    }

    public int getFailureReportId() {
        return failureReportId;
    }

    public Date getDateMaintenance() {
        return dateMaintenance;
    }

    public String getDescriptions() {
        return descriptions;
    }

}