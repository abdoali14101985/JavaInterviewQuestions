package com.abdoa.javainterview.java8;

import com.abdoa.javainterview.model.Patient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CoronaPatients {

    public static void main(String[] args) {
        Patient p1 = new Patient(1,"Ramesh",45,"Corona",10000);
        Patient p2 = new Patient(2,"Suresh",65,"Cancer",55000);
        Patient p3 = new Patient(3,"Mahesh",28,"Corona",15000);
        Patient p4 = new Patient(4,"Ganesh",37,"Tuberclosis",35000);

        List<Patient> allPatients = Arrays.asList(p1, p2, p3, p4);

        //print all corona patients
        allPatients.stream().filter(p -> p.getDisease().equals("Corona")).forEach(System.out::println);
        System.out.println("\n*******************************************\n");

        //print all corona patients less than age 30
        allPatients.stream().filter(p -> p.getDisease().equals("Corona") && p.getAge()<30).forEach(System.out::println);
        System.out.println("\n*******************************************\n");

        // Average bill amount of corona patients
        Double averageBillAmountCoronaPatients = allPatients.stream().filter(p -> p.getDisease().equals("Corona"))
                .collect(Collectors.averagingDouble(Patient::getBillAmount));
        System.out.println("Average Bill Amount of Corona Patients is "+ averageBillAmountCoronaPatients);
    }
}
