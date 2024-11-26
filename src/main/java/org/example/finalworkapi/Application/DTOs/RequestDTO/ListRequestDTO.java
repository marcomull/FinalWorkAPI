package org.example.finalworkapi.Application.DTOs.RequestDTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ListRequestDTO {

    protected int idRequest;
    protected String mechanic;
    protected int idLogistics;
    protected String logistics;
    @JsonFormat(pattern = "yyyy-MM-dd")
    protected Date requestDate;
    protected String description;
    protected String state;

    public ListRequestDTO(int idRequest, String mechanic, int idLogistics, String logistics, Date requestDate, String description, String state) {
        this.idRequest = idRequest;
        this.mechanic = mechanic;
        this.idLogistics = idLogistics;
        this.logistics = logistics;
        this.requestDate = requestDate;
        this.description = description;
        this.state = state;
    }

    public ListRequestDTO() {}

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public String getMechanic() {
        return mechanic;
    }

    public void setMechanic(String mechanic) {
        this.mechanic = mechanic;
    }

    public int getIdLogistics() {
        return idLogistics;
    }

    public void setIdLogistics(int idLogistics) {
        this.idLogistics = idLogistics;
    }

    public String getLogistics() {
        return logistics;
    }

    public void setLogistics(String logistics) {
        this.logistics = logistics;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
