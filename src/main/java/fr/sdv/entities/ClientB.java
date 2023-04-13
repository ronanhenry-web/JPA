package fr.sdv.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "client_b")
public class ClientB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private LocalDateTime dateNaissance;
    @Embedded
    private Adresse adresse;

    @ManyToOne
    @JoinColumn(name="banque_id")
    private Banque banque;

    @ManyToMany
    @JoinTable(name = "cl_co",
            joinColumns = @JoinColumn(name = "ID_CL", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_CO", referencedColumnName = "ID")
    )
    private Set<Compte> comptes;

    public ClientB() {
    }

    public ClientB(int id, String nom, String prenom, LocalDateTime dateNaissance, Banque banque, Set<Compte> comptes) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.banque = banque;
        this.comptes = comptes;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDateTime getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDateTime dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public Set<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Set<Compte> comptes) {
        this.comptes = comptes;
    }
}
