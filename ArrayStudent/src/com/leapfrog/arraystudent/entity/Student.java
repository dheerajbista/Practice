/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.arraystudent.entity;

/**
 *
 * @author AT
 */
public class Student {
    
    private int id;
    private String firstName,lastName, eamil,contactNo;
    private boolean status;
    
    
    public Student(){
            
        }
        public Student(int id){
            this.id=id;
        }

    public Student(int id, String firstName, String lastName, String eamil, String contactNo, boolean status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eamil = eamil;
        this.contactNo = contactNo;
        this.status = status;
    }
        
    public int getId(){
        return id;
    }
    
    public void setID(int id){
        this.id=id;
        
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEamil() {
        return eamil;
    }

    public String getContactNo() {
        return contactNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getFullName(){
        return firstName +" "+ lastName;
    }
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", eamil=" + eamil + ", contactNo=" + contactNo + ", status=" + status + '}';
    }
    
    
}

