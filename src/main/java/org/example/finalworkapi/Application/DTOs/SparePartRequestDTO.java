package org.example.finalworkapi.Application.DTOs;


import java.util.Date;

public class SparePartRequestDTO {

    protected int idSparePart;

    protected Date arrivalDate;

    protected String sparePart;

    protected int quantity;

    public SparePartRequestDTO(int idSparePart, Date arrivalDate, String sparePart, int quantity) {
        this.idSparePart = idSparePart;
        this.arrivalDate = arrivalDate;
        this.sparePart = sparePart;
        this.quantity = quantity;
    }

    public SparePartRequestDTO() {
    }

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
