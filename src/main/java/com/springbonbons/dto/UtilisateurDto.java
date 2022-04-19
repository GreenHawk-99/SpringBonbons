package com.springbonbons.dto;

import com.springbonbons.models.entities.Commande;
import com.springbonbons.models.entities.Commentaire;
import com.springbonbons.models.entities.Produit;
import com.springbonbons.models.entities.Role;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UtilisateurDto {
    private long id;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;

    private Role role;
    private Commentaire commentaire;
    private Commande commande;
    private Produit produit;
}
