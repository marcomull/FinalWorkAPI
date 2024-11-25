package org.example.finalworkapi.Application.DTOs.RequestDTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class AddRequestDTO {

    protected int idRequest;
    protected int idMechanic;
    protected int idLogistics;
    @JsonFormat(pattern = "yyyy-MM-dd")
    protected Date requestDate;
    protected String description;
    protected String state;

    public AddRequestDTO(int idRequest, int idMechanic, int idLogistics, Date requestDate, String description, String state) {
        this.idRequest = idRequest;
        this.idMechanic = idMechanic;
        this.idLogistics = idLogistics;
        this.requestDate = requestDate;
        this.description = description;
        this.state = state;
    }

    public AddRequestDTO() {}

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public int getIdMechanic() {
        return idMechanic;
    }

    public void setIdMechanic(int idMechanic) {
        this.idMechanic = idMechanic;
    }

    public int getIdLogistics() {
        return idLogistics;
    }

    public void setIdLogistics(int idLogistics) {
        this.idLogistics = idLogistics;
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
