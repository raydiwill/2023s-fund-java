import fr.epita.persons.datamodel.Patient;
import fr.epita.persons.services.PatientCSVService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestLoading {


    public static void main(String[] args) throws IOException, ParseException {

        List<Patient> patients = new ArrayList<>();

        PatientCSVService patientCSVService = new PatientCSVService(new File("person-csv-data/patients.csv"));

        patients = patientCSVService.readPatients();


        System.out.println(patients);
        System.out.println(patients.size());
        if (patients.size() != 6){
            throw new RuntimeException("error while reading the patients list, expected 6 but got :" + patients.size());
        }




    }
}
