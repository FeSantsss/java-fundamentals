package com.felipysantsss.javastudy.introducao.projects.ordersProject.entities;

import java.time.LocalDate;

public class Client {
    private String name;
    private String email;
    private LocalDate birthData;

    public Client(String name, String email, LocalDate birthData) {
        this.name = name;
        this.email = email;
        this.birthData = birthData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthData() {
        return birthData;
    }

    @Override
    public String toString() {
        return name + " - " + email + " (" + birthData + ") ";
    }
}
