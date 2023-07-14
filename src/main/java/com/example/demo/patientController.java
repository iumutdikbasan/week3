package com.example.demo;

import com.example.demo.model.Address;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

@Controller
public class patientController {


    @GetMapping("/patients")
    public String PatientForm(Model model){
        Address adress1 = new Address("İstanbul");
        Hasta umut = new Hasta("umut","dikbasan", LocalDate.of(2001, Month.JUNE,13),adress1);
        model.addAttribute("hasta",umut);
        return "patients";
    }
    @RequestMapping("/patients/add")
        public String addPatientForm(Model model) {
        Hasta hasta = new Hasta();
        model.addAttribute("hasta1",hasta);
        return "add-patient";

    }



















//    @PostMapping("/patients/adds")
//    public String patientSubmit(@ModelAttribute Hasta hasta,Model model){
//        model.addAttribute("patient",hasta);
//        return "patients";
//    }

//    @PostMapping(path = "/users")
//    public String signupFormSubmit(@ModelAttribute Hasta hasta){
//        return "signup-result";
//    }
//    @GetMapping(path = "/signup")
//    public String signupForm(){
//        return "signup";
//
//    }
    }















//    Patient umut = new Patient("Umut", "Dikbasan", 22);
//    Hasta ibrahim = new Hasta("İbrahim","Dikbasan","İstanbul",LocalDate.of(2010, Month.JUNE,13));

//    @GetMapping("/patients")
//    public String patientForm(Model model){
////        model.addAttribute("name",umut.getPatientName());
////        model.addAttribute("surname",umut.getPatientSurname());
////        model.addAttribute("age",umut.getPatientAge());
//        model.addAttribute("name",ibrahim.getPatientName());
//        model.addAttribute("surname",ibrahim.getPatientSurname());
//        model.addAttribute("age",ibrahim.getAge());
//        model.addAttribute("address",ibrahim.getAddress());
//        return "patients";
//    }































//    public void AddList()
//
//    {
//
//        Patient umut = new Patient("Umut", "Dikbasan", 22);
//        ArrayList<Patient> people = new ArrayList<Patient>();
//        people.add(umut);
//        Patient ibrahim = new Patient("İbrahim", "Dikbasan", 33);
//        people.add(ibrahim);
//    }





