package fr.sdv.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "virement")
@DiscriminatorValue("B")
public class Virement extends Operation {
    private String benificiaire;

    public String getBenificiaire() {
        return benificiaire;
    }

    public void setBenificiaire(String benificiaire) {
        this.benificiaire = benificiaire;
    }
}
