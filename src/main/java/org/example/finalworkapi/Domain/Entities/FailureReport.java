package org.example.finalworkapi.Domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FailureReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int idFailureReportid;
    protected int idDriver;
    protected int descriptionReport;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually

    public FailureReport() {
    }

    public FailureReport(int idFailureReportid, int idDriver, int descriptionReport) {
        this.idFailureReportid = idFailureReportid;
        this.idDriver = idDriver;
        this.descriptionReport = descriptionReport;
    }

    public int getIdFailureReportid() {
        return idFailureReportid;
    }

    public void setIdFailureReportid(int idFailureReportid) {
        this.idFailureReportid = idFailureReportid;
    }

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    public int getDescriptionReport() {
        return descriptionReport;
    }

    public void setDescriptionReport(int descriptionReport) {
        this.descriptionReport = descriptionReport;
    }
}
