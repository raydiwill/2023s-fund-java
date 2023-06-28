package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.Customer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the bank account system");
        Customer customer = new Customer("Thomas", "Paris");

        System.out.println(customer);

    }
}
