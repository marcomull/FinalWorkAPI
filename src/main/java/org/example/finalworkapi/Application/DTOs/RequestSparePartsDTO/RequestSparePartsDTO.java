package org.example.finalworkapi.Application.DTOs.RequestSparePartsDTO;

public class RequestSparePartsDTO {

    protected int idRequest;
    protected int idSparePart;
    protected int quantity;

    public RequestSparePartsDTO(int idRequest, int idSparePart, int quantity) {
        this.idRequest = idRequest;
        this.idSparePart = idSparePart;
        this.quantity = quantity;
    }

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public int getIdSparePart() {
        return idSparePart;
    }

    public void setIdSparePart(int idSparePart) {
        this.idSparePart = idSparePart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
