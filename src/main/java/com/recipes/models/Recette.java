package com.recipes.models;

import jakarta.persistence.*;

@Entity
@Table(name="recette")
public class Recette {

    @Id
    @Column(name = "id_recette")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name = "id_utilisateur", nullable = false)
    private Long idCreateur;
    @Column(name = "nom", nullable = false, length = 50)
    String nom;
    @Column(name = "description")
    String description;
    @Column(name = "type_de_plat", nullable = false)
    TypeDePlat typeDePlat;
    @Column(name = "difficulte", nullable = false)
    Difficulte difficulte;
    @Column(name = "nombre_de_portion", nullable = false, length = 2)
    Integer nombreDePortions;

    public Recette() {
        this.idCreateur = 1L;
    }

    public Recette(String nom, Difficulte difficulte) {
        this.nom = nom;
        this.difficulte = difficulte;
    }

    public Recette(String nom, String description, TypeDePlat typeDePlat, Difficulte difficulte, Integer nombreDePortions) {
        this.nom = nom;
        this.description = description;
        this.typeDePlat = typeDePlat;
        this.difficulte = difficulte;
        this.nombreDePortions = nombreDePortions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        //todo: createur ?
        sb.append("Recette : ");
        sb.append(this.nom);
        sb.append("   ---   ");
        sb.append(this.difficulte);
        sb.append("   ---   ");
        sb.append(this.typeDePlat);
        if(this.nombreDePortions != null) {
            sb.append("\nPortions : pour ");
            sb.append(this.nombreDePortions);
            sb.append(" personnes");
        }

        if(this.description != null) {
            sb.append("\nDescription : \n");
            sb.append(this.description);
        }

        return sb.toString();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCreateur() {
        return idCreateur;
    }

    public void setIdCreateur(Long idCreateur) {
        this.idCreateur = idCreateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeDePlat getTypeDePlat() {
        return typeDePlat;
    }

    public void setTypeDePlat(TypeDePlat typeDePlat) {
        this.typeDePlat = typeDePlat;
    }

    public Difficulte getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(Difficulte difficulte) {
        this.difficulte = difficulte;
    }

    public int getNombreDePortions() {
        return nombreDePortions;
    }

    public void setNombreDePortions(int nombreDePortions) {
        this.nombreDePortions = nombreDePortions;
    }
}
