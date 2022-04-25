package com.example.demo.data;

import com.example.demo.beans.Foster;
import com.example.demo.beans.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VolunteerRepo extends JpaRepository<com.example.demo.beans.Volunteer, Integer> {

    public List<Volunteer> findByLastName(String lastName);
    public List<Volunteer> findByEmail(String email);
    public List<Volunteer> findByPhoneNumber(String phoneNumber);

}
