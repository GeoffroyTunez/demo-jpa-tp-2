package fr.diginamic.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="LIVRE")
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    private String titre;
//    private String auteur;

    @OneToMany(mappedBy = "livre")
    private Set<Compo> emprunts = new HashSet<>();
    public Livre() {}

    public Livre(Integer id) {
        this.id = id;
    }

//    public Livre(String titre) {
//        this.titre = titre;
//    }




    public Livre(Integer id, String titre, String auteur) {
        this.id = id;
//        this.titre = titre;
//        this.auteur = auteur;
    }

    /**
     * Getter for id
     *
     * @return id
     */

    public Integer getId() {
        return Math.toIntExact(id);
    }

    /**
     * Getter for id
     *
     * @return id
     */

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for titre
     *
     * @return titre
     */

//    public String getTitre() {
//        return titre;
//    }

    /**
     * Getter for titre
     *
     * @return titre
     */

//    public void setTitre(String titre) {
//        this.titre = titre;
//    }

    /**
     * Getter for auteur
     *
     * @return auteur
     */

//    public String getAuteur() {
//        return auteur;
//    }

    /**
     * Getter for auteur
     *
     * @return auteur
     */

//    public void setAuteur(String auteur) {
//        this.auteur = auteur;
//    }

    @Override
    public String toString() {
        return "livre{" +
                "id=" + id +
//                ", titre='" + titre + '\'' +
//                ", auteur='" + auteur + '\'' +
                '}';
    }
}
