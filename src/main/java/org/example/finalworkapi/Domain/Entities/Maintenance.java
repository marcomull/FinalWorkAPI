package org.example.finalworkapi.Domain.Entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int idMaintenance;
    protected int idDriver;
    protected int idAdministrator;
    protected int idTypeMaintenance;
    protected int idFailureReport;
    protected Date dateMaintenance;
    protected String description;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually

    public Maintenance() {
    }

    public Maintenance(int idMaintenance, int idDriver, int idAdministrator, int idTypeMaintenance, int idFailureReport, Date dateMaintenance, String description) {
        this.idMaintenance = idMaintenance;
        this.idDriver = idDriver;
        this.idAdministrator = idAdministrator;
        this.idTypeMaintenance = idTypeMaintenance;
        this.idFailureReport = idFailureReport;
        this.dateMaintenance = dateMaintenance;
        this.description = description;
    }

    public int getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    public int getIdAdministrator() {
        return idAdministrator;
    }

    public void setIdAdministrator(int idAdministrator) {
        this.idAdministrator = idAdministrator;
    }

    public int getIdTypeMaintenance() {
        return idTypeMaintenance;
    }

    public void setIdTypeMaintenance(int idTypeMaintenance) {
        this.idTypeMaintenance = idTypeMaintenance;
    }

    public int getIdFailureReport() {
        return idFailureReport;
    }

    public void setIdFailureReport(int idFailureReport) {
        this.idFailureReport = idFailureReport;
    }

    public Date getDateMaintenance() {
        return dateMaintenance;
    }

    public void setDateMaintenance(Date dateMaintenance) {
        this.dateMaintenance = dateMaintenance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
