package com.ntech.registration.Controller;

import com.ntech.registration.model.Professional;
import com.ntech.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class NtechController {

	@Autowired
	RegistrationService registrationService;

	@PostMapping(value = "/professional")
	public ResponseEntity<Object> addProfessional(@RequestBody Professional professional) {
	    String status = "false";
		status = registrationService.addProfessional(professional) + "";
		Map map = new HashMap<>();
        map.put("status", status);
        if(status.equals("true")) {
            map.put("message", "Congratulations!!! You have registered ssuccesfully!");
        }
        else{
                map.put("message", "You are already registered.");

        }
		return new ResponseEntity<>(map , HttpStatus.OK );
	}

	@GetMapping(value = "/professional")
	public List<Professional> fetchProfessionals() {
		List<Professional> pro = registrationService.fetchProfessionals();
		return pro;
	}
}
