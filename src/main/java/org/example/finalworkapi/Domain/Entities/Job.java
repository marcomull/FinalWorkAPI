package org.example.finalworkapi.Domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int idJob;
    protected int idMaintenance;
    protected int idMechanic;
    protected int idReplacement;
    protected String startMaintenance;
    protected String endMaintenance;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually

    public Job() {
    }

    public Job(int idJob, int idMaintenance, int idMechanic, int idReplacement, String startMaintenance, String endMaintenance) {
        this.idJob = idJob;
        this.idMaintenance = idMaintenance;
        this.idMechanic = idMechanic;
        this.idReplacement = idReplacement;
        this.startMaintenance = startMaintenance;
        this.endMaintenance = endMaintenance;
    }

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

    public int getIdReplacement() {
        return idReplacement;
    }

    public void setIdReplacement(int idReplacement) {
        this.idReplacement = idReplacement;
    }

    public String getStartMaintenance() {
        return startMaintenance;
    }

    public void setStartMaintenance(String startMaintenance) {
        this.startMaintenance = startMaintenance;
    }

    public String getEndMaintenance() {
        return endMaintenance;
    }

    public void setEndMaintenance(String endMaintenance) {
        this.endMaintenance = endMaintenance;
    }

}
