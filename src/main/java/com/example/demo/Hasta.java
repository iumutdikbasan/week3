package com.example.demo;

import com.example.demo.model.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Hasta {
//    private String patientName;
//    private String patientSurname;
//    private LocalDate dob;
//    private String address;
//    private Integer age;
private String patientName;
    private String patientSurname;
    private LocalDate dob;

    private Integer age;
    private Address  address;

    public Hasta(String patientName, String patientSurname, LocalDate dob,Address  address) {
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.dob = dob;
        this.address = address;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSurname() {
        return patientSurname;
    }

    public void setPatientSurname(String patientSurname) {
        this.patientSurname = patientSurname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();// YAŞ HESAPLAMA
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public void setAddress(Address address) {
        this.address = address;
    }
    public Address getAddress(){
        return address;
    }

}
