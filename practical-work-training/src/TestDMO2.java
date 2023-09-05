import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.datamodel.PassengerClass;
import fr.epita.titanic.datamodel.PassengerSex;

public class TestDMO2 {

    public static void test() {
        Passenger passenger = new Passenger("Abbing, Mr Anthony", PassengerClass.OTHER, 0.0, PassengerSex.OTHER, true );
        System.out.println(passenger);
    }
}
