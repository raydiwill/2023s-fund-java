package fr.epita.titanic.datamodel;

public enum PassengerSex {
    MALE("male"),
    FEMALE("female"),

    OTHER("");

    private final String encodedName;

    PassengerSex(String encodedName) {
        this.encodedName = encodedName;
    }
}
