package fr.sdv;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
        System.out.println(emf);
        if (emf != null) {
            System.out.println("Connected to the database.");
            emf.close();
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}