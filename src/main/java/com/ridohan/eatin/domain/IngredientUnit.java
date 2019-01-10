package com.ridohan.eatin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class IngredientUnit {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String symbol;

    public IngredientUnit(String name, String symbol ) {
        this.name = name;
        this.symbol = symbol;
     }
}
