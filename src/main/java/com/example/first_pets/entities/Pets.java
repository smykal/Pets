package com.example.first_pets.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;
@Entity(name = "pets")
@Data
public class Pets {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String type;
    private boolean indoor = true;
}
