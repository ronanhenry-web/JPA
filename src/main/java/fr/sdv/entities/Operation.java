package fr.sdv.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "operation")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime date;
    private double montant;
    private String motif;

    @ManyToOne
    @JoinColumn(name="compte_id")
    private Compte compte;

    public Operation() {
    }

    public Operation(int id, LocalDateTime date, double montant, String motif, Compte compte) {
        this.id = id;
        this.date = date;
        this.montant = montant;
        this.motif = motif;
        this.compte = compte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
}
