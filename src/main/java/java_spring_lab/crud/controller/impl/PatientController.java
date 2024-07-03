package java_spring_lab.crud.controller.impl;

import java_spring_lab.crud.model.Patient;
import java_spring_lab.crud.service.interfaces.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PatientController {

    @Autowired
    IPatientService patientService;

    @PostMapping("/patients")
    @ResponseStatus(HttpStatus.CREATED)
    public void savePatient(@RequestBody Patient patient){
        patientService.savePatient(patient);
    }

}
