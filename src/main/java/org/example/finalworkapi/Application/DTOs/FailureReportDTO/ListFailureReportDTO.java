package org.example.finalworkapi.Application.DTOs.FailureReportDTO;

public class ListFailureReportDTO {

    private int idFailureReport;
    private int idDriver;
    private String descriptionReport;

    public ListFailureReportDTO(int idFailureReport, int idDriver, String descriptionReport) {
        this.idFailureReport = idFailureReport;
        this.idDriver = idDriver;
        this.descriptionReport = descriptionReport;
    }

    public ListFailureReportDTO() {}

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
