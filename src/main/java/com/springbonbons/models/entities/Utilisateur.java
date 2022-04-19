package com.springbonbons.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;

    @ManyToOne
    private Role role;
    @OneToMany
    private List<Commentaire> commentaires;
    @OneToMany
    private List<Commande> commandes;
    @ManyToMany
    private List<Produit> produits;
}
