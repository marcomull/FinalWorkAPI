package org.example.finalworkapi.Application.DTOs.VehicleDTO;

public class VehicleDTO {

    private int idVehicle;
    private String brand;
    private String model;
    private String plate;

    public VehicleDTO(int idVehicle,String brand, String model, String plate) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.idVehicle = idVehicle;
    }

    public VehicleDTO() {
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

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
