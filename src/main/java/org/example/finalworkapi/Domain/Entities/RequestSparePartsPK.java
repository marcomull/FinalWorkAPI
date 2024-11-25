package org.example.finalworkapi.Domain.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RequestSparePartsPK implements Serializable {

    @Column(name = "idRequest")
    private int idRequest;

    @Column(name = "idSparePart")
    private int idSparePart;

    // Getters, Setters, equals() y hashCode()

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestSparePartsPK that = (RequestSparePartsPK) o;
        return idRequest == that.idRequest && idSparePart == that.idSparePart;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRequest, idSparePart);
    }
}
