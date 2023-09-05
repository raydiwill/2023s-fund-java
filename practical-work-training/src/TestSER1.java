import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.datamodel.PassengerClass;

public class TestSER1 {

    public static void test() {
        String example = "Allen, Miss Elisabeth Walton                           ;1st   ;29  ;female;1       ";
        String[] passengersPart = example.split(";");
        String name = passengersPart[0].trim();
        PassengerClass passengerClassAsString = PassengerClass.resolve(passengersPart[1].trim());
        Double passengerAgeAsDouble = Double.parseDouble(passengersPart[2].trim());
        String passengerSexAsString = passengersPart[3].trim();
        Boolean survived = "1".equals(passengersPart[4].trim()) ;
        Passenger examplePassenger =  new Passenger();
    }

    public PassengerClass stringToPassengerClass(String s){
        return PassengerClass.resolve(s);

    }
}
