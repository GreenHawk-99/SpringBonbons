package com.springbonbons.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date dateCommande;
    private String status;

    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToMany
    private List<Inventaire> inventaires;
}
