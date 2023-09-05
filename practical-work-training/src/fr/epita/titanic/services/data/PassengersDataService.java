package fr.epita.titanic.services.data;

import fr.epita.titanic.datamodel.Passenger;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PassengersDataService {

    public Map<String, Double> calculateAgeDistribution(List<Passenger> passengers){

        Map<String, Double> distribution = new LinkedHashMap<>();
        for(Passenger p : passengers){
            String ageCategory = String.valueOf(p.getAge());
            Double currentCount = distribution.get(ageCategory);
            if (currentCount == null){
                currentCount = 0.0;
            }
            distribution.put(ageCategory, currentCount + 1/passengers.size());
        }
        return distribution;

    }
}
