package org.example.finalworkapi.Application.DTOs.MechanicDTO;

import java.util.Date;

public class JobMechanicDTO {

    private int idJob;
    private int idMaintenance;
    private int idMechanic;
    private Date startMaintenance;
    private Date endMaintenance;
    private String sparePart;

    public JobMechanicDTO() {
    }

    public JobMechanicDTO(int idJob, int idMaintenance, int idMechanic, Date startMaintenance, Date endMaintenance, String sparePart) {
        this.idJob = idJob;
        this.idMaintenance = idMaintenance;
        this.idMechanic = idMechanic;
        this.startMaintenance = startMaintenance;
        this.endMaintenance = endMaintenance;
        this.sparePart = sparePart;
    }

    public int getIdMechanic() {
        return idMechanic;
    }

    public void setIdMechanic(int idMechanic) {
        this.idMechanic = idMechanic;
    }

    public int getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public int getIdJob() {
        return idJob;
    }

    public void setIdJob(int idJob) {
        this.idJob = idJob;
    }

    public Date getStartMaintenance() {
        return startMaintenance;
    }

    public void setStartMaintenance(Date startMaintenance) {
        this.startMaintenance = startMaintenance;
    }

    public Date getEndMaintenance() {
        return endMaintenance;
    }

    public void setEndMaintenance(Date endMaintenance) {
        this.endMaintenance = endMaintenance;
    }

    public String getSparePart() {
        return sparePart;
    }

    public void setSparePart(String sparePart) {
        this.sparePart = sparePart;
    }
}
