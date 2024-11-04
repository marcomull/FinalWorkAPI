package org.example.finalworkapi.Application.DTOs.MechanicDTO;

import java.util.Date;

public class JobMechanicDTO {

    private int idJob;
    private Date startMaintenance;
    private Date endMaintenance;
    private String sparePart;

    public JobMechanicDTO(int idJob, Date startMaintenance, Date endMaintenance, String sparePart) {
        this.idJob = idJob;
        this.startMaintenance = startMaintenance;
        this.endMaintenance = endMaintenance;
        this.sparePart = sparePart;
    }

    public JobMechanicDTO() {
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
