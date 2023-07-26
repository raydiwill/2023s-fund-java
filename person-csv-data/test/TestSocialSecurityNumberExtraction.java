import fr.epita.persons.datamodel.Patient;

import static fr.epita.persons.services.PatientCSVService.enrichPatient;

public class TestSocialSecurityNumberExtraction {

    public static void main(String[] args) {
        //given
        String socialSecurityNumber = "2758965423102";
        Patient patient = new Patient(2758965423102L, "test","test");

        //when we extract
        enrichPatient(socialSecurityNumber, patient);

        //then we should have F as gender (female), 1975 as year of birth, 89 as department of birth
        if (patient.getYearOfBirth() != 1975){
            throw new RuntimeException("problem verifying the extraction of the year of birth");
        }
        if (!patient.getDepartment().equals("89")){
            throw new RuntimeException("problem verifying the extraction of the department of birth");
        }
        if (!patient.getGender().equals("F")){
            throw new RuntimeException("problem verifying the extraction of the gender");
        }



    }

}
