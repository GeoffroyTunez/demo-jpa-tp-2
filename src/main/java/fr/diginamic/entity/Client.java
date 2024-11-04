package fr.diginamic.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CLIENT")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private String prenom;

    @OneToMany(mappedBy = "client")
    private Set<Emprunt> emprunts = new HashSet<>();


    public Client(Integer id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * Getter for getid
     *
     * @return id
     */

    public Integer getId() {
        return Math.toIntExact(id);
    }

    /**
     * Getter for getid
     *
     * @return id
     */

    public void setId(Integer id) {
        this.id = Integer.valueOf(id);
    }

    /**
     * Getter for getnom
     *
     * @return nom
     */

    public String getNom() {
        return nom;
    }

    /**
     * Getter for getnom
     *
     * @return nom
     */

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter for getprenom
     *
     * @return prenom
     */

    public String getPrenom() {
        return prenom;
    }

    /**
     * Getter for getprenom
     *
     * @return prenom
     */

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
