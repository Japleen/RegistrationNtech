package com.ntech.registration.Controller;

import com.ntech.registration.model.Professional;
import com.ntech.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class NtechController {

	@Autowired
	RegistrationService registrationService;

	@PostMapping(value = "/professional")
	public void addProfessional(@RequestBody Professional professional) {
		registrationService.addProfessional(professional);
	}

	@GetMapping(value = "/professional")
	public List<Professional> fetchProfessionals() {
		List<Professional> pro = registrationService.fetchProfessionals();
		return pro;
	}
}
