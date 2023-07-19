import fr.epita.persons.datamodel.Patient;

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
        List<String> lines = Files.readAllLines(new File("person-csv-data/patients.csv").toPath());
        System.out.println(lines);
        lines.forEach(System.out::println);

        List<String> partsForFirstPatient = Arrays.asList(lines.get(1).split(";"));
        String rawSocialSecurityNumber = partsForFirstPatient.get(0);
        rawSocialSecurityNumber = rawSocialSecurityNumber.replace("\"", "");
        long socialSecurityNumber = Long.parseLong(rawSocialSecurityNumber);
        Patient patientZero = new Patient(socialSecurityNumber,partsForFirstPatient.get(1), partsForFirstPatient.get(2));
        SimpleDateFormat formatter =  new SimpleDateFormat("dd/MM/yyyy");
        Date parsedDate = formatter.parse(partsForFirstPatient.get(6));
        patientZero.setPat_subscription_date(parsedDate);
        patientZero.setPat_address(partsForFirstPatient.get(3));
        patientZero.setPat_tel(partsForFirstPatient.get(4));
        patientZero.setPat_insurance_id(Integer.parseInt(partsForFirstPatient.get(5)));
        System.out.println(patientZero.toString());


    }
}
