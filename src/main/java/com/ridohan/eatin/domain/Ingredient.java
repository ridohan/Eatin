package com.ridohan.eatin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Getter
    @Setter
    @OneToOne(optional = false)
    private Material material;

    @Getter
    @Setter
    @OneToOne(optional = false)
    private IngredientUnit ingredientUnit;


    @Getter
    @Setter
    @Column(nullable = false)
    private Double quantity;

    public Ingredient(Material material, IngredientUnit ingredientUnit, Double quantity) {
        this.material = material;
        this.ingredientUnit = ingredientUnit;
        this.quantity = quantity;
    }
}