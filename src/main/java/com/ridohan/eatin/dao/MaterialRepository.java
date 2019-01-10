package com.ridohan.eatin.dao;

import com.ridohan.eatin.domain.Ingredient;
import com.ridohan.eatin.domain.Material;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "material", path = "material")
public interface MaterialRepository extends PagingAndSortingRepository<Material, Long> {

    List<Material> findByName(@Param("name") String name);

}