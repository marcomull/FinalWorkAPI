package org.example.finalworkapi.Domain.Entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "maintenance")
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMaintenance")
    protected int idMaintenance;

    @ManyToOne
    @JoinColumn(name = "idVehicle")
    protected Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "idAdministrator")
    protected Administrator administrator;

    @ManyToOne
    @JoinColumn(name = "idTypeMaintenance")
    protected TypeMaintenance typeMaintenance;

    @ManyToOne
    @JoinColumn(name = "idFailureReport")
    protected FailureReport failureReport;

    @JoinColumn(name = "DateMaintenance")
    protected Date dateMaintenance;

    @JoinColumn(name = "descriptions")
    protected String descriptions;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually

    public Maintenance() {
    }

    public Maintenance(int idMaintenance, Vehicle idVehicle, Administrator idAdministrator,
                       TypeMaintenance idTypeMaintenance, FailureReport idFailureReport,
                       Date dateMaintenance, String descriptions) {
        this.idMaintenance = idMaintenance;
        this.vehicle = idVehicle;
        this.administrator = idAdministrator;
        this.typeMaintenance = idTypeMaintenance;
        this.failureReport = idFailureReport;
        this.dateMaintenance = dateMaintenance;
        this.descriptions = descriptions;
    }

    public Maintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public int getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public TypeMaintenance getTypeMaintenance() {
        return typeMaintenance;
    }

    public void setTypeMaintenance(TypeMaintenance typeMaintenance) {
        this.typeMaintenance = typeMaintenance;
    }

    public FailureReport getFailureReport() {
        return failureReport;
    }

    public void setFailureReport(FailureReport failureReport) {
        this.failureReport = failureReport;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getDateMaintenance() {
        return dateMaintenance;
    }

    public void setDateMaintenance(Date dateMaintenance) {
        this.dateMaintenance = dateMaintenance;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}
