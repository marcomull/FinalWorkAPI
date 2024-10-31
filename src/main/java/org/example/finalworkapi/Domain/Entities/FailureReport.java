package org.example.finalworkapi.Domain.Entities;

import jakarta.persistence.*;

//
@Entity
@Table(name = "failurereport")
public class FailureReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int idFailureReport;
    protected int idDriver;

    @Column(name = "descriptionReport", columnDefinition = "TEXT")
    private String descriptionReport;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually

    public FailureReport() {
    }

    public FailureReport(int idFailureReport, int idDriver, String descriptionReport) {
        this.idFailureReport = idFailureReport;
        this.idDriver = idDriver;
        this.descriptionReport = descriptionReport;
    }

    public FailureReport(int failureReportId) {
        this.idFailureReport = failureReportId;
    }

    public int getIdFailureReport() {
        return idFailureReport;
    }

    public void setIdFailureReport(int idFailureReport) {
        this.idFailureReport = idFailureReport;
    }

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    public String getDescriptionReport() {
        return descriptionReport;
    }

    public void setDescriptionReport(String descriptionReport) {
        this.descriptionReport = descriptionReport;
    }
}
