package com.ridohan.eatin.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
public class Recipe {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Getter
    @Setter
    @Column(nullable = false)
    private String name;


    @Getter
    @Setter
    @Column(nullable = false)
    private int nbPersons;


    @Getter
    @Setter
    @OneToMany
    private List<Ingredient> ingredients;

    public Recipe(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }
}
