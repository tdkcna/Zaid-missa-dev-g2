package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private BigDecimal prixx;

    // Constructeur par défaut requis par JPA
    public Produit() {
    }

    public Produit(String nom, BigDecimal prixx) {
        this.nom = nom;
        this.prixx = prixx;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public BigDecimal getprixx() {
        return prixx;
    }

    public void setprixx(BigDecimal prixx) {
        this.prixx = prixx;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prixx=" + prixx +
                '}';
    }
}