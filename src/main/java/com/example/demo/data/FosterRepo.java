package com.example.demo.data;

import com.example.demo.beans.Foster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FosterRepo extends JpaRepository<com.example.demo.beans.Foster, Integer> {

    public List<Foster> findByLastName(String lastName);
    public List<Foster> findByEmail(String email);
    public List<Foster> findByPhoneNumber(String phoneNumber);

}
