/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nscompany.pawstop;

/**
 *
 * @author Lenovo
 */
public class petdetails {
     int id;
    String name;   
    String gender;
    String species;
    String breed;
    String dob;
    String premed;
    String symp;
    String oname;
    String phoneno;
    String email;
    String address;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPremed(String premed) {
        this.premed = premed;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public String getSpecies() {
        return species;
    }

    public String getBreed() {
        return breed;
    }

    public String getDob() {
        return dob;
    }

    public String getPremed() {
        return premed;
    }

    public String getOname() {
        return oname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
    
    public int getId() {
        return id;
    }
 
 public void setId(int id) {
        this.id = id;
    }
    
  public String getSymp() {
        return symp;
    }

    public void setSymp(String symp) {
        this.symp = symp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
      public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}
