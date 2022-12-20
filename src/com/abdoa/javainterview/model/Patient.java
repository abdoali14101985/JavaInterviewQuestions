package com.abdoa.javainterview.model;

public class Patient {

    private int patientId;
    private String name;
    private int age;
    private String disease;
    private int billAmount;

    public Patient() {
    }

    public Patient(int patientId, String name, int age, String disease, int billAmount) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.billAmount = billAmount;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                ", billAmount=" + billAmount +
                '}';
    }
}
