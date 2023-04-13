package fr.sdv.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "banque")
public class Banque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    @OneToMany(mappedBy = "banque", fetch = FetchType.EAGER)
    private Set<ClientB> clientBS;

    public Banque() {
    }

    public Banque(int id, String nom, Set<ClientB> clientBS) {
        this.id = id;
        this.nom = nom;
        this.clientBS = clientBS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<ClientB> getClientBS() {
        return clientBS;
    }

    public void setClientBS(Set<ClientB> clientBS) {
        this.clientBS = clientBS;
    }
}
