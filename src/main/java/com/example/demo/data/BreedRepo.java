package com.example.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreedRepo extends JpaRepository<com.example.demo.beans.Breed, Integer> {


}
