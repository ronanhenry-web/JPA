package fr.sdv.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "emprunt")
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "DATE_DEBUT")
    private LocalDateTime debut;
    @Column(name = "DATE_FIN")
    private LocalDateTime fin;
    @Column(name = "DELAI")
    private int delai;
    @ManyToOne
    @JoinColumn(name="ID_CLIENT")
    private Client client;

    @ManyToMany
    @JoinTable(name = "compo",
            joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID")
    )
    private Set<Livre> livres;

    public Emprunt() {
    }

    public Emprunt(int id, LocalDateTime debut, LocalDateTime fin, int delai, Client client, Set<Livre> livres) {
        this.id = id;
        this.debut = debut;
        this.fin = fin;
        this.delai = delai;
        this.client = client;
        this.livres = livres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDebut() {
        return debut;
    }

    public void setDebut(LocalDateTime debut) {
        this.debut = debut;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public int getDelai() {
        return delai;
    }

    public void setDelai(int delai) {
        this.delai = delai;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "id=" + id +
                ", debut=" + debut +
                ", fin=" + fin +
                ", delai=" + delai +
                ", client=" + client +
                ", livres=" + livres.toString() +
                '}';
    }
}
