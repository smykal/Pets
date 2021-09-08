package com.example.first_pets.repositories;

import com.example.first_pets.entities.Pets;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;


import java.util.List;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "pets", path = "pets")
public interface PetsRepository extends PagingAndSortingRepository<Pets, UUID> {
    List findByName(@Param("name") String name);
}
