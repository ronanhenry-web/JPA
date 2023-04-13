package fr.sdv.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "fournisseur")
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(mappedBy = "fournisseur", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Article> article;
    private String nom;

    public Fournisseur() {}

    public Fournisseur(int id, String nom) {
        this.id = id;
        this.nom = nom;
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

    public Set<Article> getArticle() {
        return article;
    }

    public void setArticle(Set<Article> article) {
        this.article = article;
    }

    public void addArticle(Article article) {
        article.setFournisseur(this);
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
