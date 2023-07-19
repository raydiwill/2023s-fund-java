package fr.epita.persons.datamodel;

public class Patient {

    private int pat_num_HC;
    private String pat_lastname;
    private String pat_firstname;
    private String pat_address;
    private String pat_tel;
    private int pat_insurance_id;

    private String pat_subscription_date;

    public Patient(int pat_num_HC, String pat_lastname, String pat_firstname) {
        this.pat_num_HC = pat_num_HC;
        this.pat_lastname = pat_lastname;
        this.pat_firstname = pat_firstname;
    }

    public int getPat_num_HC() {
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

    public String getPat_subscription_date() {
        return pat_subscription_date;
    }

    public void setPat_subscription_date(String pat_subscription_date) {
        this.pat_subscription_date = pat_subscription_date;
    }
}
