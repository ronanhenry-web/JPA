package fr.sdv.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
    private int numero;
    private String rue;
    private int codePostal;
    private String ville;

}
