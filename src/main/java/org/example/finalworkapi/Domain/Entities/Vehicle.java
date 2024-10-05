package org.example.finalworkapi.Domain.Entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int idVehicle;
    protected String brand;
    protected String model;
    protected Date yearManufacture;
    protected int mileage;
    protected String maintenancePlan;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually

    public Vehicle() {
    }

    public Vehicle(int idVehicle, String brand, String model, Date yearManufacture, int mileage, String maintenancePlan) {
        this.idVehicle = idVehicle;
        this.brand = brand;
        this.model = model;
        this.yearManufacture = yearManufacture;
        this.mileage = mileage;
        this.maintenancePlan = maintenancePlan;
    }

    public int getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(int idVehicle) {
        this.idVehicle = idVehicle;
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
