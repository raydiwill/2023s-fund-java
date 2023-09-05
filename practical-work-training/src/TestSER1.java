import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.datamodel.PassengerClass;
import fr.epita.titanic.datamodel.PassengerSex;
import fr.epita.titanic.services.data.PassengersCSVDAO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TestSER1 {

    public static void test() throws IOException {
        String pathname = "practical-work-training/data-training.csv";
        System.out.println(PassengersCSVDAO.readAll(pathname));
    }

    public PassengerClass stringToPassengerClass(String s){
        return PassengerClass.resolve(s);

    }
}
