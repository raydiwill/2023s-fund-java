import fr.epita.persons.datamodel.Patient;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLoading {


    public static void main(String[] args) throws IOException {

        List<Patient> patients = new ArrayList<>();
        List<String> lines = Files.readAllLines(new File("person-csv-data/patients.csv").toPath());
        System.out.println(lines);
        lines.forEach(System.out::println);

        List<String> partsForFirstPatient = Arrays.asList(lines.get(1).split(";"));

        Patient patientZero = new Patient();


    }
}
