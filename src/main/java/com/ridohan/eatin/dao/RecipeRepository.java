package com.ridohan.eatin.dao;

import com.ridohan.eatin.domain.IngredientUnit;
import com.ridohan.eatin.domain.Recipe;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "recipe", path = "recipe")
public interface RecipeRepository extends PagingAndSortingRepository<Recipe, Long> {

    List<IngredientUnit> findByName(@Param("name") String name);

}