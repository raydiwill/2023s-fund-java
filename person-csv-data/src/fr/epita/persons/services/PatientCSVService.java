package fr.epita.persons.services;

import fr.epita.persons.datamodel.Patient;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PatientCSVService {


    private File csvFile;

    public PatientCSVService(File inputFile){
        this.csvFile = inputFile;
    }

    public List<Patient> readPatients() throws IOException, ParseException {

        List<Patient> patients = new ArrayList<>();
        List<String> lines = Files.readAllLines(csvFile.toPath());
        System.out.println(lines);
        lines.forEach(System.out::println);

        for (int i = 1; i < lines.size(); i++) {
            String currentLine = lines.get(i);
            List<String> partsForFirstPatient = Arrays.asList(currentLine.split(";"));
            String rawSocialSecurityNumber = partsForFirstPatient.get(0);
            rawSocialSecurityNumber = rawSocialSecurityNumber.replace("\"", "");
            long socialSecurityNumber = Long.parseLong(rawSocialSecurityNumber);
            Patient currentPatient = new Patient(socialSecurityNumber, partsForFirstPatient.get(1), partsForFirstPatient.get(2));
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date parsedDate = formatter.parse(partsForFirstPatient.get(6));
            currentPatient.setPat_subscription_date(parsedDate);
            currentPatient.setPat_address(partsForFirstPatient.get(3));
            currentPatient.setPat_tel(partsForFirstPatient.get(4));
            currentPatient.setPat_insurance_id(Integer.parseInt(partsForFirstPatient.get(5)));
            enrichPatient(rawSocialSecurityNumber,currentPatient);
            patients.add(currentPatient);
        }
        return patients;

    }



    public void writePatients(File file, List<Patient> patients) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(file);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        //when
        for(Patient p: patients){
            String line = "";
            line += p.getPat_num_HC() + ";";
            line += p.getPat_lastname() + ";";
            line += p.getPat_firstname() + ";";
            line += p.getPat_address() + ";";
            line += p.getPat_tel() + ";";
            line += p.getPat_insurance_id() + ";";
            line += simpleDateFormat.format(p.getPat_subscription_date()) + ";";
            line += p.getYearOfBirth() + ";";
            line += p.getGender() + ";";
            line += p.getDepartment();
            writer.println(line);
        }

        writer.close();
    }

    public static void enrichPatient(String socialSecurityNumber, Patient patient) {
        String rawGender = socialSecurityNumber.substring(0, 1);
        String gender = "";
        if (rawGender.equals("2")){
            gender = "F";
        } else if(rawGender.equals("1")){
            gender = "M";
        }
        if (gender.isEmpty()){
            //exception
        }

        Integer yearOfBirth = Integer.parseInt("19"+ socialSecurityNumber.substring(1, 3));
        String department = socialSecurityNumber.substring(3,5);

        patient.setYearOfBirth(yearOfBirth);
        patient.setDepartment(department);
        patient.setGender(gender);
    }


}
