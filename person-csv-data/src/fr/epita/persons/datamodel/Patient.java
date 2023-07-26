package fr.epita.persons.datamodel;

import java.util.Date;

public class Patient {

    private long pat_num_HC;
    private String pat_lastname;
    private String pat_firstname;
    private String pat_address;
    private String pat_tel;
    private int pat_insurance_id;

    private Date pat_subscription_date;
    private String gender;
    private String department;
    private Integer yearOfBirth;

    public Patient(long pat_num_HC, String pat_lastname, String pat_firstname) {
        this.pat_num_HC = pat_num_HC;
        this.pat_lastname = pat_lastname;
        this.pat_firstname = pat_firstname;
    }

    public long getPat_num_HC() {
        return pat_num_HC;
    }

    public String getPat_lastname() {
        return pat_lastname;
    }

    public String getPat_firstname() {
        return pat_firstname;
    }

    public String getPat_address() {
        return pat_address;
    }

    public void setPat_address(String pat_address) {
        this.pat_address = pat_address;
    }

    public String getPat_tel() {
        return pat_tel;
    }

    public void setPat_tel(String pat_tel) {
        this.pat_tel = pat_tel;
    }

    public int getPat_insurance_id() {
        return pat_insurance_id;
    }

    public void setPat_insurance_id(int pat_insurance_id) {
        this.pat_insurance_id = pat_insurance_id;
    }

    public Date getPat_subscription_date() {
        return pat_subscription_date;
    }

    public void setPat_subscription_date(Date pat_subscription_date) {
        this.pat_subscription_date = pat_subscription_date;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "pat_num_HC=" + pat_num_HC +
                ", pat_lastname='" + pat_lastname + '\'' +
                ", pat_firstname='" + pat_firstname + '\'' +
                ", pat_address='" + pat_address + '\'' +
                ", pat_tel='" + pat_tel + '\'' +
                ", pat_insurance_id=" + pat_insurance_id +
                ", pat_subscription_date='" + pat_subscription_date + '\'' +
                '}';
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }
}
