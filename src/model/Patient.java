/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author manavhirey
 */
public class Patient extends Person{

    public Patient(long ssn, String name, String gender, String dob, long phoneNo, String email, String address, String username, String password, UserRole role) {
        super(ssn, name, gender, dob, phoneNo, email, address, username, password, UserRole.PATIENT);
    }
}
