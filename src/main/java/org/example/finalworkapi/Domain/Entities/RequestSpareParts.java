package org.example.finalworkapi.Domain.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "requestspareparts")
public class RequestSpareParts {

    @EmbeddedId
    private RequestSparePartsPK id; // Clave primaria compuesta

    @ManyToOne
    @MapsId("idRequest") // Esto hace que 'idRequest' sea parte de la clave primaria
    @JoinColumn(name = "idRequest", referencedColumnName = "idRequest", insertable = false, updatable = false)
    private Request request;

    @ManyToOne
    @MapsId("idSparePart") // Esto hace que 'idSparePart' sea parte de la clave primaria
    @JoinColumn(name = "idSparePart", referencedColumnName = "idSparePart", insertable = false, updatable = false)
    private SparePart sparePart;

    @Column(name = "quantity")
    private int quantity;

    // Getters y Setters

    public RequestSparePartsPK getId() {
        return id;
    }

    public void setId(RequestSparePartsPK id) {
        this.id = id;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public SparePart getSparePart() {
        return sparePart;
    }

    public void setSparePart(SparePart sparePart) {
        this.sparePart = sparePart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

