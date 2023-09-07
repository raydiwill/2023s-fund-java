package fr.epita.dbtraining.services.data;

import fr.epita.dbtraining.datamodel.Doctor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DoctorDAO {
    public void save(Doctor doctor) throws SaveFailedException {

        Connection connection = DriverManager.getConnection("jdbc:h2:mem:test");
        PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO  DOCTORS (doc_id , doc_name) VALUES (?, ?)");
        insertStatement.setString(1, doctor.getId());
        insertStatement.setString(2, doctor.getName());
        insertStatement.execute();
    }
}
