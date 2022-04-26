package com.example.demo.data;

import com.example.demo.beans.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepo extends JpaRepository<com.example.demo.beans.Owner, Integer> {

    public List<Owner> findByLastName(String lastName);
    public List<Owner> findByEmail(String email);
    public List<Owner> findByPhoneNumber(String phoneNumber);

}
