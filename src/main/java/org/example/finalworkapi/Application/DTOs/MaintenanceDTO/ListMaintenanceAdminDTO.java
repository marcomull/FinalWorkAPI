package org.example.finalworkapi.Application.DTOs.MaintenanceDTO;

import java.util.Date;

public class ListMaintenanceAdminDTO {

    private int idMaintenance;
    private String plate;
    private String brand;
    private String model;
    private Date yearManufacture;
    private int mileage;
    private String maintenancePlan;
    private String nameType;
    private String descriptionReport;
    private Date dateMaintenance;
    private String descriptions;

    public ListMaintenanceAdminDTO(int idMaintenance, String plate, String brand, String model, Date yearManufacture, int mileage, String maintenancePlan, String nameType, String descriptionReport, Date dateMaintenance, String descriptions) {
        this.idMaintenance = idMaintenance;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.yearManufacture = yearManufacture;
        this.mileage = mileage;
        this.maintenancePlan = maintenancePlan;
        this.nameType = nameType;
        this.descriptionReport = descriptionReport;
        this.dateMaintenance = dateMaintenance;
        this.descriptions = descriptions;
    }

    public ListMaintenanceAdminDTO() {
    }

    public int getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(Date yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getMaintenancePlan() {
        return maintenancePlan;
    }

    public void setMaintenancePlan(String maintenancePlan) {
        this.maintenancePlan = maintenancePlan;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getDescriptionReport() {
        return descriptionReport;
    }

    public void setDescriptionReport(String descriptionReport) {
        this.descriptionReport = descriptionReport;
    }

    public Date getDateMaintenance() {
        return dateMaintenance;
    }

    public void setDateMaintenance(Date dateMaintenance) {
        this.dateMaintenance = dateMaintenance;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}
