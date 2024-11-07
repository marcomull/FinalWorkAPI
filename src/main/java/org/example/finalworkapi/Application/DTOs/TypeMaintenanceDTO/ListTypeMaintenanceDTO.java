package org.example.finalworkapi.Application.DTOs.TypeMaintenanceDTO;

public class ListTypeMaintenanceDTO {

    private int idTypeMaintenance;
    private String nameType;
    private String description;

    public ListTypeMaintenanceDTO() {}

    public ListTypeMaintenanceDTO(int idTypeMaintenance, String nameType, String description) {
        this.idTypeMaintenance = idTypeMaintenance;
        this.nameType = nameType;
        this.description = description;
    }

    public int getIdTypeMaintenance() {
        return idTypeMaintenance;
    }

    public void setIdTypeMaintenance(int idTypeMaintenance) {
        this.idTypeMaintenance = idTypeMaintenance;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
