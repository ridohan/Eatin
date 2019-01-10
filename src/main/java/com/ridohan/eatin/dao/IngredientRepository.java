package com.ridohan.eatin.dao;

import com.ridohan.eatin.domain.Ingredient;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "ingredient", path = "ingredient")
public interface IngredientRepository extends PagingAndSortingRepository<Ingredient, Long> {


}