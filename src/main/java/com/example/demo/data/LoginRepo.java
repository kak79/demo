package com.example.demo.data;

import com.example.demo.beans.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<com.example.demo.beans.Login, Integer> {

    public Login getIdByUsername(String username);

}
