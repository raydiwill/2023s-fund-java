package fr.epita.ddd.services.data;

import fr.epita.ddd.datamodel.Judoka;
import fr.epita.ddd.services.exceptions.SaveFailedException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JudokaDAO {


    public void save(Judoka instance) throws SaveFailedException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:mem:judo", "user", "password");
            //(name VARCHAR, belt VARCHAR, yearOfBirth INTEGER)
            String insert = "INSERT INTO JUDOKAS (name, belt, yearOfBirth) VALUES (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1, instance.getName());
            preparedStatement.setString(2, instance.getBelt());
            preparedStatement.setInt(3, instance.getYearOfBirth());
            preparedStatement.execute();
        }catch (SQLException sqlException){
            throw new SaveFailedException(sqlException);
        }

    }
}
