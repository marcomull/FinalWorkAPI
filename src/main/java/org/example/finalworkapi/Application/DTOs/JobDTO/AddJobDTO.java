package org.example.finalworkapi.Application.DTOs.JobDTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class AddJobDTO {

    private int idJob;
    private int idMaintenance;
    private int idMechanic;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startMaintenance;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endMaintenance;
    private int IdSparePart;

    public AddJobDTO(int idJob, int idMaintenance, int idMechanic, Date startMaintenance, Date endMaintenance, int idSparePart) {
        this.idJob = idJob;
        this.idMaintenance = idMaintenance;
        this.idMechanic = idMechanic;
        this.startMaintenance = startMaintenance;
        this.endMaintenance = endMaintenance;
        IdSparePart = idSparePart;
    }

    public AddJobDTO() {}

    public int getIdJob() {
        return idJob;
    }

    public void setIdJob(int idJob) {
        this.idJob = idJob;
    }

    public int getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public int getIdMechanic() {
        return idMechanic;
    }

    public void setIdMechanic(int idMechanic) {
        this.idMechanic = idMechanic;
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

    public int getIdSparePart() {
        return IdSparePart;
    }


}
