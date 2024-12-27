package com.akki;

public class Person {
    private String firstName;
    private String familyName;
    private String address;

    // Constructeur pour l'adresse uniquement
    public Person(String address) {
        this.address = address;
    }

    // Constructeur complet
    public Person(String firstName, String familyName, String address) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.address = address;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getAdress() {
        return address;
    }

    // toString pour affichage
    @Override
    public String toString() {
        return "Person{" +
               "firstName='" + firstName + '\'' +
               ", familyName='" + familyName + '\'' +
               ", address='" + address + '\'' +
               '}';
    }
}
