package java_spring_lab.crud.service.impl;

import java_spring_lab.crud.model.Patient;
import java_spring_lab.crud.repository.PatientRepository;
import java_spring_lab.crud.service.interfaces.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService implements IPatientService {
    @Autowired
    PatientRepository patientRepository;

    @Override
    public void savePatient(Patient patient) {
        patientRepository.save(patient);
    }
}
