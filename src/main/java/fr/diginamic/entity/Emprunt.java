package fr.diginamic.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "EMPRUNT")
public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate dateDebut;
    private Integer delaiMax;
    private LocalDate dateFin;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = true)
    private Client client;

    @OneToMany(mappedBy = "emprunt")
    private Set<Compo> livres = new HashSet<>();

    public Emprunt(Integer id, LocalDate dateDebut, Integer delaiMax, LocalDate dateFin, Client client, Set<Compo> livres) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.delaiMax = delaiMax;
        this.dateFin = dateFin;
        this.client = client;
        this.livres = livres;
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
     * Getter for getdateDebut
     *
     * @return dateDebut
     */

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    /**
     * Getter for getdateDebut
     *
     * @return dateDebut
     */

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * Getter for getdelaiMax
     *
     * @return delaiMax
     */

    public Integer getDelaiMax() {
        return delaiMax;
    }

    /**
     * Getter for getdelaiMax
     *
     * @return delaiMax
     */

    public void setDelaiMax(Integer delaiMax) {
        this.delaiMax = delaiMax;
    }

    /**
     * Getter for getdateFin
     *
     * @return dateFin
     */

    public LocalDate getDateFin() {
        return dateFin;
    }

    /**
     * Getter for getdateFin
     *
     * @return dateFin
     */

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * Getter for getclient
     *
     * @return client
     */

    public Client getClient() {
        return client;
    }

    /**
     * Getter for getclient
     *
     * @return client
     */

    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Getter for getlivres
     *
     * @return livres
     */

    public Set<Compo> getLivres() {
        return livres;
    }

    /**
     * Getter for getlivres
     *
     * @return livres
     */

    public void setLivres(Set<Compo> livres) {
        this.livres = livres;
    }

    @Override
    public String toString() {
        return "emprunt{" +
                "id=" + id +
                ", dateDebut=" + dateDebut +
                ", delaiMax=" + delaiMax +
                ", dateFin=" + dateFin +
                ", client=" + client +
                ", livres=" + livres +
                '}';
    }
}
