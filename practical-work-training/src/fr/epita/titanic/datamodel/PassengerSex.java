package fr.epita.titanic.datamodel;

public enum PassengerSex {
    MALE("male"),
    FEMALE("female"),

    OTHER("");

    private final String encodedName;

    PassengerSex(String encodedName) {
        this.encodedName = encodedName;
    }

    public static PassengerSex resolve(String s) {
        PassengerSex[] enumEntries = PassengerSex.values();
        for (PassengerSex entry : enumEntries){
            if(entry.encodedName.equals(s)){
                return entry;
            }
        }
        return OTHER;
    }
}
