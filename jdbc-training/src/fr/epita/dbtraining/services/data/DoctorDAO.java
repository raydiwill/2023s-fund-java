package fr.epita.dbtraining.services.data;

import fr.epita.dbtraining.datamodel.Doctor;
import fr.epita.dbtraining.services.exceptions.SaveFailedException;
import fr.epita.dbtraining.services.exceptions.SearchFailedException;
import fr.epita.dbtraining.services.exceptions.UpdateFailedException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAO {
    public void save(Doctor doctor) throws SaveFailedException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:mem:test");
            PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO  DOCTORS (doc_id , doc_name) VALUES (?, ?)");
            insertStatement.setString(1, doctor.getId());
            insertStatement.setString(2, doctor.getName());
            insertStatement.execute();
        } catch (SQLException e) {
            throw new SaveFailedException(e);
        }
    }

    public void delete(String id) throws DeleteFailedException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:mem:test");
            PreparedStatement deleteStatement = connection.prepareStatement("DELETE FROM DOCTORS WHERE doc_id = ?");
            deleteStatement.setString(1, id);
            deleteStatement.execute();
        }catch (SQLException sqlException){
            throw new DeleteFailedException(sqlException);
        }
    }

    public void update(String id, Doctor updated) throws UpdateFailedException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:mem:test");
            PreparedStatement update = connection.prepareStatement("UPDATE DOCTORS SET doc_id = ?, doc_name=? WHERE doc_id = ?");
            update.setString(1, updated.getId());
            update.setString(3, updated.getId());
            update.setString(2, updated.getName());
            update.execute();
        }catch (SQLException sqlException){
            throw new UpdateFailedException(sqlException);
        }

    }

    public List<Doctor> search(Doctor doctor) throws SearchFailedException {
        List<Doctor> doctors = new ArrayList<>();
        try {
            //inputContenForSearch = "1 OR 1=1; DROP TABLE DOCTOR; SELECT 1 FROM DUAL ";
            //doctor.id = web.getInputContentForSearch()
            Connection connection = DriverManager.getConnection("jdbc:h2:mem:test");
            PreparedStatement selectStatement = connection.prepareStatement("SELECT doc_id , doc_name " +
                    "FROM  DOCTORS " +
                    "WHERE (? IS NULL OR doc_id= ?) AND (? IS NULL OR doc_name = ?)" +
                    "LIMIT 5");
            selectStatement.setString(1, doctor.getId());
            selectStatement.setString(2, doctor.getId());
            selectStatement.setString(3, doctor.getName());
            selectStatement.setString(4, doctor.getName());
            ResultSet resultSet = selectStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("doc_id");
                String name = resultSet.getString("doc_name");
                Doctor foundDoctor = new Doctor(id, name);
                doctors.add(foundDoctor);

            }
        }catch (SQLException sqle){
            throw new SearchFailedException();
        }
        return doctors;
    }

}
