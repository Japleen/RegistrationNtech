package com.ntech.registration.service;

import com.ntech.registration.dao.RegistrationDao;
import com.ntech.registration.model.Professional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    RegistrationDao registrationDao;


    public void addProfessional(Professional professional) {
        Professional prof = registrationDao.insert(professional);
        System.out.println("Inserted" + prof.getFirstName());
    }

    public List<Professional> fetchProfessionals() {
        return registrationDao.findAll();
    }

}
