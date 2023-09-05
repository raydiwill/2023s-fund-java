package fr.epita.titanic.datamodel;

public enum PassengerClass {

    FIRST("1st"),
    SECOND("2nd"),
    THIRD("3rd"),

    OTHER("");

    private final String pClass;

    PassengerClass(String pClass) {
        this.pClass = pClass;
    }


    public static PassengerClass resolve(String s) {
        PassengerClass[] enumEntries = PassengerClass.values();
        for (PassengerClass entry : enumEntries){
            if(entry.pClass.equals(s)){
                return entry;
            }
        }
        return OTHER;
    }
}
