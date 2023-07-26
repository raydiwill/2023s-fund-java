import fr.epita.persons.datamodel.Patient;
import fr.epita.persons.services.PatientCSVService;

import java.io.*;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class TestWritingCSV {

    public static void main(String[] args) throws IOException {
        //given
        Patient patient = new Patient(2758965423102L, "testLastName", "testFirstName");
        patient.setPat_address("Paris");
        patient.setPat_tel("124");
        patient.setGender("F");
        patient.setDepartment("89");
        patient.setYearOfBirth(1975);
        patient.setPat_subscription_date(new Date());
        File file = new File("./person-csv-data/patients_out.csv");


        List<Patient> patients = List.of(patient);
        PatientCSVService service = new PatientCSVService(file);

        //when
        service.writePatients(file, patients);

        //then
        String s = Files.readString(file.toPath());
        if (!s.endsWith("1975;F;89")){
            throw new RuntimeException("invalid line written");
        }


    }

}
