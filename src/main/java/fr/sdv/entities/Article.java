package fr.sdv.entities;

import javax.persistence.*;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "REF")
    private String reference;
    @Column(name = "DESIGNATION")
    private String libelle;
    @ManyToOne
    @JoinColumn(name = "ID_FOU")
    private Fournisseur fournisseur;

    public Article() {
    }

    public Article(Integer id, String reference, String libelle, Fournisseur fournisseur) {
        this.id = id;
        this.reference = reference;
        this.libelle = libelle;
        setFournisseur(fournisseur);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        if (this.fournisseur != null) {
            this.fournisseur.getArticle().remove(this);
        }
        this.fournisseur = fournisseur;
        if (this.fournisseur != null) {
            this.fournisseur.getArticle().add(this);
        }
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", reference='" + reference + '\'' +
                ", libelle='" + libelle + '\'' +
                ", fournisseur=" + fournisseur +
                '}';
    }
}
