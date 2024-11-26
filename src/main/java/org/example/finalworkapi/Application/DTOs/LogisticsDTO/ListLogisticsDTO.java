package org.example.finalworkapi.Application.DTOs.LogisticsDTO;

public class ListLogisticsDTO {
    private int id;
    private String email;
    private String password;

    public ListLogisticsDTO(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
