package com.example.demo.data;

import com.example.demo.beans.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepo extends JpaRepository<com.example.demo.beans.Pet, Integer> {

    public List<Pet> findByTypeName(String typeName);
    public List<Pet> findByAge(int ageMonths, int ageYears);
    public List<Pet> findByGender(String gender);
    public List<Pet> findByAdopted(Boolean adopted);

}
