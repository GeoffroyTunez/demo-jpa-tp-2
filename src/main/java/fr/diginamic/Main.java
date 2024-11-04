package fr.diginamic;

import fr.diginamic.entity.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
        EntityManager em = emf.createEntityManager();

        Integer livre1 = 1;

        Livre livre = em.find(Livre.class, livre1);

        if (livre != null) {
            System.out.println("Livre trouvé : " + livre);
        }else{
            System.out.println("livre non trouvé avec l'id : " + livre1);
        }


        em.close();
        emf.close();
    }
}