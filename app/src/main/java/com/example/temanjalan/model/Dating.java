package com.example.temanjalan.model;

import androidx.annotation.NonNull;

public class Dating {
    private String status, date, teman, teamReq, teamAcc, phone, name, idMatch, idField, idUser;

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdField() {
        return idField;
    }

    public void setIdField(String idField) {
        this.idField = idField;
    }

    public String getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(String idMatch) {
        this.idMatch = idMatch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeman() {
        return teman;
    }

    public void setTeman(String field) {
        this.teman = teman;
    }

    public String getTeamReq() {
        return teamReq;
    }

    public void setTeamReq(String teamReq) {
        this.teamReq = teamReq;
    }

    public String getTeamAcc() {
        return teamAcc;
    }

    public void setTeamAcc(String teamAcc) {
        this.teamAcc = teamAcc;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }
}