package com.ntech.registration.service;

import com.ntech.registration.dao.RegistrationDao;
import com.ntech.registration.model.Professional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    RegistrationDao registrationDao;


    public boolean addProfessional(Professional professional) {
         Example <Professional> example = Example.of(professional);
         if(registrationDao.exists(example)){
            return false;
         }
         else {
             Professional prof =registrationDao.insert(professional);
             if(prof !=null){
                 return true;
             }
         }
         return false;
    }

    public List<Professional> fetchProfessionals() {
        return registrationDao.findAll();
    }

}
