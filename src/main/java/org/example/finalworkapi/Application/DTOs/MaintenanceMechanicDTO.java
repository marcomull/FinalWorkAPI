package org.example.finalworkapi.Application.DTOs;

import java.util.Date;

public class MaintenanceMechanicDTO {

    private int idMaintenance;
    private String plate;
    private String brand;
    private String model;
    private Date yearManufacture;
    private int mileage;
    private String maintenancePlan;

    public MaintenanceMechanicDTO() {
    }

    public MaintenanceMechanicDTO(int idMaintenance, String plate, String brand, String model, Date yearManufacture, int mileage, String maintenancePlan) {
        this.idMaintenance = idMaintenance;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.yearManufacture = yearManufacture;
        this.mileage = mileage;
        this.maintenancePlan = maintenancePlan;
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
}
