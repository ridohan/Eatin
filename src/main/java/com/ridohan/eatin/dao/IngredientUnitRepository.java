package com.ridohan.eatin.dao;

import com.ridohan.eatin.domain.Ingredient;
import com.ridohan.eatin.domain.IngredientUnit;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "ingredientunit", path = "ingredientunit")
public interface IngredientUnitRepository extends PagingAndSortingRepository<IngredientUnit, Long> {

    List<IngredientUnit> findByName(@Param("name") String name);

}