package fr.epita.ddd;

import fr.epita.ddd.datamodel.Judoka;
import fr.epita.ddd.services.data.JudokaDAO;
import fr.epita.ddd.services.exceptions.SaveFailedException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDatabase {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:h2:mem:judo;DB_CLOSE_DELAY=-1", "user", "password");

        PreparedStatement preparedStatement = connection.prepareStatement("CREATE TABLE JUDOKAS (name VARCHAR, belt VARCHAR, yearOfBirth INTEGER)");

        preparedStatement.execute();

        System.out.println(connection.getSchema());

        JudokaDAO dao = new JudokaDAO();

        try {
            dao.save(new Judoka("Teddy Riner", "black", 1986));
        } catch (SaveFailedException e) {
            throw new RuntimeException(e);
        }


    }
}
