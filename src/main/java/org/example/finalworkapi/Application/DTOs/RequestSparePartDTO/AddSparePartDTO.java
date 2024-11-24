package org.example.finalworkapi.Application.DTOs.RequestSparePartDTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class AddSparePartDTO {

    protected int idSparePart;
    @JsonFormat(pattern = "yyyy-MM-dd")
    protected Date arrivalDate;
    protected String sparePart;
    protected String mechanic;
    protected String logistics;

    public AddSparePartDTO(int idSparePart, Date arrivalDate, String sparePart, String mechanic, String logistics) {
        this.idSparePart = idSparePart;
        this.arrivalDate = arrivalDate;
        this.sparePart = sparePart;
        this.mechanic = mechanic;
        this.logistics = logistics;
    }

    public AddSparePartDTO() {}

    public int getIdSparePart() {
        return idSparePart;
    }

    public void setIdSparePart(int idSparePart) {
        this.idSparePart = idSparePart;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getSparePart() {
        return sparePart;
    }

    public void setSparePart(String sparePart) {
        this.sparePart = sparePart;
    }

    public String getMechanic() {
        return mechanic;
    }

    public void setMechanic(String mechanic) {
        this.mechanic = mechanic;
    }

    public String getLogistics() {
        return logistics;
    }

    public void setLogistics(String logistics) {
        this.logistics = logistics;
    }
}
