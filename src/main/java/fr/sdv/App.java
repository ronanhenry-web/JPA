package fr.sdv;

import fr.sdv.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
        EntityManager em = emf.createEntityManager();

        //TP 3
        /*Client client = em.find(Client.class, 1);
        System.out.println(client.getEmprunts());

        Emprunt emprunt = em.find(Emprunt.class, 1);
        System.out.println(emprunt.getLivres());*/

        //TP Test
        //Fournisseur fournisseur = em.find(Fournisseur.class, 3);
        //System.out.println(fournisseur.getArticle());

        //Article article = em.find(Article.class, 3);
        //System.out.println(article);

        // TP2
        //Livre unLivre = em.find(Livre.class, 2);

        //System.out.println(unLivre);

        //Livre lAModifier = em.find(Livre.class, 5);
        //Livre lASupprimer = em.find(Livre.class, 2);

        em.getTransaction().begin();
        //lAModifier.setTitre("Du plaisir dans la cuisine");
        //em.remove(lASupprimer);

        em.getTransaction().commit();

        /*String query = "SELECT b FROM Livre b WHERE b.auteur = :auteur";
        List<Livre> livres = em.createQuery(query, Livre.class)
                .setParameter("auteur", "Jules Verne")
                .getResultList();

        for (Livre livre : livres) {
            System.out.println(livre.getTitre() + ", " + livre.getAuteur());
        }*/

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