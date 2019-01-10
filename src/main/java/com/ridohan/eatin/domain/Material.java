package com.ridohan.eatin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Getter
    @Setter
    @Column(nullable = false)
    private String name;



    public Material(String name) {
        this.name = name;
    }
}