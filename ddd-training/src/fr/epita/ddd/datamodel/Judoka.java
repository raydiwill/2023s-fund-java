package fr.epita.ddd.datamodel;

public class Judoka {
    String name;
    String belt;

    Integer yearOfBirth;

    public Judoka(String name, String belt, Integer yearOfBirth) {
        this.name = name;
        this.belt = belt;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBelt() {
        return belt;
    }

    public void setBelt(String belt) {
        this.belt = belt;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}

