package com.springbonbons.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String texte;
    private Date dateCommentaire;

    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToOne
    private Produit produit;
}
