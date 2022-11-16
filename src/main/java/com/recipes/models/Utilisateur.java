package com.recipes.models;

import jakarta.persistence.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @Column(name = "id_utilisateur")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, length = 20)
    String pseudo;

    @Column(nullable = false, length = 50)
    String email;
    @Column(name = "mot_de_passe", nullable = false, length = 25)
    String motDePasse;

    public Utilisateur(Long id, String pseudo, String email, String motDePasse) {
        this.id = id;
        this.pseudo = pseudo;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public Utilisateur() {

    }
}
