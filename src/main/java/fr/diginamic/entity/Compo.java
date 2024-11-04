package fr.diginamic.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "COMPO")
public class Compo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_livre", nullable = false)
    private Livre livre;

    @ManyToOne
    @JoinColumn(name = "id_emprunt", nullable = false)
    private Emprunt emprunt;


    public Compo(Integer id, Livre livre, Emprunt emprunt) {
        this.id = id;
        this.livre = livre;
        this.emprunt = emprunt;
    }

    /**
     * Getter for getid
     *
     * @return id
     */

    public Integer getId() {
        return id;
    }

    /**
     * Getter for getid
     *
     * @return id
     */

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for getlivre
     *
     * @return livre
     */

    public Livre getLivre() {
        return livre;
    }

    /**
     * Getter for getlivre
     *
     * @return livre
     */

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    /**
     * Getter for getemprunt
     *
     * @return emprunt
     */

    public Emprunt getEmprunt() {
        return emprunt;
    }

    /**
     * Getter for getemprunt
     *
     * @return emprunt
     */

    public void setEmprunt(Emprunt emprunt) {
        this.emprunt = emprunt;
    }

    @Override
    public String toString() {
        return "compo{" +
                "id=" + id +
                ", livre=" + livre +
                ", emprunt=" + emprunt +
                '}';
    }
}
