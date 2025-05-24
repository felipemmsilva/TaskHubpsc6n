package models;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GerenciadorProjetosApp {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();

        Usuario usuario =
                new Usuario(1, "Muttley", "muttley@gmail.com",
                        "12345");
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
    }
}
