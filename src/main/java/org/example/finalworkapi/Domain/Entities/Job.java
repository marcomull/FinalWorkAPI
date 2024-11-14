package org.example.finalworkapi.Domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idJob")
    protected int idJob;

    @ManyToOne
    @JoinColumn(name = "idMaintenance")
    protected Maintenance idMaintenance;

    @ManyToOne
    @JoinColumn(name ="idMechanic")
    protected Mechanic idMechanic;

    @ManyToOne
    @JoinColumn(name ="idSparePart")
    protected SparePart idSparePart;

    @Temporal(TemporalType.DATE)
    @JoinColumn(name ="startMaintenance")
    protected Date startMaintenance;

    @Temporal(TemporalType.DATE)
    @JoinColumn(name ="endMaintenance")
    protected Date endMaintenance;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually

    public Job() {
    }

    public Job(int idJob, Maintenance idMaintenance, Mechanic idMechanic, SparePart idSparePart, Date startMaintenance, Date endMaintenance) {
        this.idJob = idJob;
        this.idMaintenance = idMaintenance;
        this.idMechanic = idMechanic;
        this.idSparePart = idSparePart;
        this.startMaintenance = startMaintenance;
        this.endMaintenance = endMaintenance;
    }

    public int getIdJob() {
        return idJob;
    }

    public void setIdJob(int idJob) {
        this.idJob = idJob;
    }

    public Maintenance getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(Maintenance idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public Mechanic getIdMechanic() {
        return idMechanic;
    }

    public void setIdMechanic(Mechanic idMechanic) {
        this.idMechanic = idMechanic;
    }

    public SparePart getIdSparePart() {
        return idSparePart;
    }

    public void setIdSparePart(SparePart idSparePart) {
        this.idSparePart = idSparePart;
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
}
