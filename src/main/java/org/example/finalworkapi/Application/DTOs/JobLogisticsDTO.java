package org.example.finalworkapi.Application.DTOs;

import java.util.Date;

public class JobLogisticsDTO {

    private int idSparePart;
    private Date startMaintenance;
    private String sparePart;
    private int mechanic;

    public JobLogisticsDTO(int idSparePart, Date startMaintenance, String sparePart, int mechanic) {
        this.idSparePart = idSparePart;
        this.startMaintenance = startMaintenance;
        this.sparePart = sparePart;
        this.mechanic = mechanic;
    }

    public JobLogisticsDTO() {
    }

    public int getIdSparePart() {
        return idSparePart;
    }

    public void setIdSparePart(int idSparePart) {
        this.idSparePart = idSparePart;
    }

    public Date getStartMaintenance() {
        return startMaintenance;
    }

    public void setStartMaintenance(Date startMaintenance) {
        this.startMaintenance = startMaintenance;
    }

    public String getSparePart() {
        return sparePart;
    }

    public void setSparePart(String sparePart) {
        this.sparePart = sparePart;
    }

    public int getMechanic() {
        return mechanic;
    }

    public void setMechanic(int mechanic) {
        this.mechanic = mechanic;
    }
}
