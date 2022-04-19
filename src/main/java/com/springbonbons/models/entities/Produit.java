package com.springbonbons.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String image;

    @ManyToOne
    private Categorie categorie;
    @ManyToMany
    private List<Utilisateur> utilisateurs;
    @OneToMany
    private List<Inventaire> inventaires;
}
