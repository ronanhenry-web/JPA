package fr.sdv;

import fr.sdv.entities.Fournisseur;
import fr.sdv.entities.Livre;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblio");
        EntityManager em = emf.createEntityManager();

        Livre unLivre = em.find(Livre.class, 2);

        System.out.println(unLivre);

        //Livre lAModifier = em.find(Livre.class, 5);
        //Livre lASupprimer = em.find(Livre.class, 2);

        em.getTransaction().begin();

        //lAModifier.setTitre("Du plaisir dans la cuisine");
        //em.remove(lASupprimer);

        em.getTransaction().commit();

        String query = "SELECT b FROM Livre b WHERE b.auteur = :auteur";
        List<Livre> livres = em.createQuery(query, Livre.class)
                .setParameter("auteur", "Jules Verne")
                .getResultList();

        for (Livre livre : livres) {
            System.out.println(livre.getTitre() + ", " + livre.getAuteur());
        }

        /*String query = "SELECT b FROM Livre b";
        List<Livre> livres = em.createQuery(query, Livre.class).getResultList();

        for (Livre livre : livres) {
            System.out.println(livre.getTitre() + ", " + livre.getAuteur());
        }*/

        // em = entityManagerFactory
        em.close();
        // emf = entityManager
        emf.close();
        //em.getTransaction().begin();
    }
}