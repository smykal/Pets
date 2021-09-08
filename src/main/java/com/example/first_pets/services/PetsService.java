package com.example.first_pets.services;

import com.example.first_pets.entities.Pets;
import com.example.first_pets.repositories.PetsRepository;
import org.springframework.stereotype.Service;

@Service
public class PetsService {

    private final PetsRepository petsRepository;

    public PetsService(PetsRepository petsRepository) {
        this.petsRepository = petsRepository;
    }

    public Pets save(Pets pet) {
        return petsRepository.save(pet);
    }
}
