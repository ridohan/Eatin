package com.ridohan.eatin;

import com.ridohan.eatin.dao.IngredientRepository;
import com.ridohan.eatin.dao.IngredientUnitRepository;
import com.ridohan.eatin.dao.MaterialRepository;
import com.ridohan.eatin.dao.RecipeRepository;
import com.ridohan.eatin.domain.Ingredient;
import com.ridohan.eatin.domain.IngredientUnit;
import com.ridohan.eatin.domain.Material;
import com.ridohan.eatin.domain.Recipe;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class EatinApplication {


    @Autowired
    private IngredientUnitRepository ingredientUnitRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private MaterialRepository materialRepository;

    @Autowired
    private RecipeRepository recipeRepository;

    public static void main(String[] args) {
        SpringApplication.run(EatinApplication.class, args);
    }


    @Bean
    InitializingBean sendDatabase() {
        return () -> {
            Material material = materialRepository.save(new Material("apple"));
            IngredientUnit ingredientUnit = ingredientUnitRepository.save(new IngredientUnit("piece","u "));
            Ingredient ingredient  = ingredientRepository.save(new Ingredient(material,ingredientUnit,1.00));


            Recipe recipe = recipeRepository.save(new Recipe("Tarte aux pommes", Collections.singletonList(ingredient)));

         };
    }
}
