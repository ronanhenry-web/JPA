package fr.sdv.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "assurance_vie")
public class AssuranceVie extends Compte {
    private LocalDate dateFin;
    private double taux;

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
