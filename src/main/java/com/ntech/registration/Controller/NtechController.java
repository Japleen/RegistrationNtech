package com.ntech.registration.Controller;

import com.ntech.registration.model.Professional;
import com.ntech.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NtechController {

    @Autowired
    RegistrationService registrationService;

    @GetMapping("/error")
    public String err() {
        System.out.println("inside 1");
        return "No";
    }

    @PostMapping(value="/add" )
    public void addProfessional(@RequestBody Professional professional) {
        registrationService.addProfessional(professional);
    }

    @GetMapping(value="/add" )
    public List<Professional> fetchProfessionals() {
        System.out.println("inside");
        List<Professional> pro = registrationService.fetchProfessionals();
        if (pro.isEmpty()) {
            System.out.println("NO RECORDS");
        }
        return pro;
    }
}
