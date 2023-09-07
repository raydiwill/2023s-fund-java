import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:h2:mem:test");
        if ("PUBLIC".equals(connection.getSchema())) {
            System.out.println("connection sucessful");
        }
        PreparedStatement preparedStatement = connection.prepareStatement("CREATE TABLE DOCTORS (doc_id VARCHAR(10), doc_name VARCHAR(255))");
        preparedStatement.execute();
        PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO  DOCTORS (doc_id , doc_name) VALUES ('1', 'MARCH')");
        insertStatement.execute();
        PreparedStatement selectStatement = connection.prepareStatement("SELECT doc_id , doc_name FROM  DOCTORS LIMIT 5");
        ResultSet resultSet = selectStatement.executeQuery();
        while (resultSet.next()) {
            String id = resultSet.getString("doc_id");
            String name = resultSet.getString("doc_name");
            System.out.println("id:name =>" + id + ":" + name);
        }

        connection.close();


    }
}