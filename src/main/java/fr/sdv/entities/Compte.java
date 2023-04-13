package fr.sdv.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "compte")
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String numero;
    private double solde;
    @ManyToMany(mappedBy = "comptes")
    private Set<ClientB> clientBS;
    @OneToMany(mappedBy = "compte", fetch = FetchType.EAGER)
    private Set<Operation> operations;

    public Compte() {
    }

    public Compte(int id, String numero, double solde, Set<ClientB> clientBS, Set<Operation> operations) {
        this.id = id;
        this.numero = numero;
        this.solde = solde;
        this.clientBS = clientBS;
        this.operations = operations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Set<ClientB> getClientBS() {
        return clientBS;
    }

    public void setClientBS(Set<ClientB> clientBS) {
        this.clientBS = clientBS;
    }

    public Set<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }
}
