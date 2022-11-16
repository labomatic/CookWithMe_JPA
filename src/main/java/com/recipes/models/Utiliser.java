package com.recipes.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "utiliser")
public class Utiliser {

    @Id
    @Column(name = "id_ingredient")
    Long idIngredient;

    @Id
    @Column(name = "id_recette")
    Long idRecette;


    @Column(name = "quantite")
    int quantite;


    @Column(name = "unite")
    String unite;


    public Utiliser(Long idIngredient, Long idRecette, int quantite, String unite) {
        this.idIngredient = idIngredient;
        this.idRecette = idRecette;
        this.quantite = quantite;
        this.unite = unite;
    }


    public Utiliser() {

    }
}
