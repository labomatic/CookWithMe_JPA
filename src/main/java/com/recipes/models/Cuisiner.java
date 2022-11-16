package com.recipes.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "cuisiner")
public class Cuisiner {

    @Id
    @Column(name = "id_recette")
    Long idRecette;
    @Id
    @Column(name = "id_utilisateur")
    Long idUtilisateur;

    @Column(name = "date_utilisation", nullable = false)
    LocalDate dateUtilisation;

    public Cuisiner(Long idRecette, Long idUtilisateur, LocalDate dateUtilisation) {
        this.idRecette = idRecette;
        this.idUtilisateur = idUtilisateur;
        this.dateUtilisation = dateUtilisation;
    }

    public Cuisiner() {

    }
}
