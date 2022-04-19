package com.springbonbons.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Inventaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int quantite;
    private float prix;
    private String portion;

    @ManyToOne
    private Produit produit;
    @ManyToMany
    private List<Commande> commandes;
}
