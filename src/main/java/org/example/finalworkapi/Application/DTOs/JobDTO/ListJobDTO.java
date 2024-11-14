package org.example.finalworkapi.Application.DTOs.JobDTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ListJobDTO {

    private int idJob;
    private int idMaintenance;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startMaintenance;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endMaintenance;
    private String sparePart;

    public ListJobDTO(int idJob, int idMaintenance, Date startMaintenance, Date endMaintenance, String sparePart) {
        this.idJob = idJob;
        this.idMaintenance = idMaintenance;
        this.startMaintenance = startMaintenance;
        this.endMaintenance = endMaintenance;
        this.sparePart = sparePart;
    }

    public ListJobDTO(){
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

    public int getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }
}
