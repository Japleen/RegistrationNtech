package com.ntech.registration.service;

import com.ntech.registration.model.Professional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegistrationService {
    public void addProfessional(Professional professional);

    public List<Professional> fetchProfessionals();

}
