import fr.epita.dbtraining.datamodel.Doctor;
import fr.epita.dbtraining.services.data.DeleteFailedException;
import fr.epita.dbtraining.services.data.DoctorDAO;
import fr.epita.dbtraining.services.exceptions.SaveFailedException;
import fr.epita.dbtraining.services.exceptions.SearchFailedException;
import fr.epita.dbtraining.services.exceptions.UpdateFailedException;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:h2:mem:test");
        if ("PUBLIC".equals(connection.getSchema())) {
            System.out.println("connection sucessful");
        }
        PreparedStatement preparedStatement = connection.prepareStatement("CREATE TABLE DOCTORS (doc_id VARCHAR(10), doc_name VARCHAR(255))");
        preparedStatement.execute();

        //TODO
        Doctor doctor = new Doctor("1234", "APRIL");
        DoctorDAO doctorDAO = new DoctorDAO();
        try {
            doctorDAO.save(doctor);
        }catch (SaveFailedException saveFailedException){
            //warn the user that it is not working
        }
        try {
            List<Doctor> doctors = doctorDAO.search(new Doctor("1234", null));
            boolean successCondition = doctors.size() == 1;
            if (!successCondition){
                throw new RuntimeException("failed to retrieve doctor with id 1234");
            }
            else{
                System.out.println(doctors);
            }
        } catch (SearchFailedException e) {
         //warn the user that search was not possible
        }

        //test update
        try {
            List<Doctor> doctors = doctorDAO.search(new Doctor("1234", null));
            Doctor doctorToUpdate = doctors.get(0);
            doctorToUpdate.setName("OCTOBER");
            doctorDAO.update(doctorToUpdate.getId(), doctorToUpdate);
            doctors = doctorDAO.search(new Doctor("1234", null));
            if ("OCTOBER".equals(doctors.get(0).getName())){
                System.out.println("update ok");
            }else{
                throw new RuntimeException("update ko");
            }
        } catch (SearchFailedException e) {
            //warn the user that search was not possible
        } catch (UpdateFailedException e) {
            throw new RuntimeException(e);
        }


        try {
            doctorDAO.delete("1234");
            List<Doctor> doctors = doctorDAO.search(new Doctor("1234", null));
            if (!doctors.isEmpty()){
                throw new RuntimeException("delete does not work");
            }else{
                System.out.println("delete ok");
            }

        } catch (DeleteFailedException e) {
            throw new RuntimeException(e);
        } catch (SearchFailedException e) {
            throw new RuntimeException(e);
        }


        connection.close();



    }
}