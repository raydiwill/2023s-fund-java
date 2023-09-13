package fr.epita.dbtraining.datamodel;

public class Doctor {
    private final String id;
    private String name;

    public Doctor(String id, String name) {

        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
