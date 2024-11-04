package org.example.finalworkapi.Application.DTOs.MaintenanceDTO;

public class SearchMaintenanceDTO {
    private int maintenanceId;
    private int failureReportId;
    private int vehicleId;
    private int administratorId;
    private int typeMaintenanceId;

    public SearchMaintenanceDTO(int maintenanceId, int failureReportId, int vehicleId, int administratorId, int typeMaintenanceId) {
        this.maintenanceId = maintenanceId;
        this.failureReportId = failureReportId;
        this.vehicleId = vehicleId;
        this.administratorId = administratorId;
        this.typeMaintenanceId = typeMaintenanceId;
    }

    public SearchMaintenanceDTO() {}

    public int getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(int maintenanceId) {
        this.maintenanceId = maintenanceId;
    }

    public int getFailureReportId() {
        return failureReportId;
    }

    public void setFailureReportId(int failureReportId) {
        this.failureReportId = failureReportId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(int administratorId) {
        this.administratorId = administratorId;
    }

    public int getTypeMaintenanceId() {
        return typeMaintenanceId;
    }

    public void setTypeMaintenanceId(int typeMaintenanceId) {
        this.typeMaintenanceId = typeMaintenanceId;
    }
}
