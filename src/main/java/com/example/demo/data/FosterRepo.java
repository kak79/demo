package com.example.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FosterRepo extends JpaRepository<com.example.demo.beans.Foster, Integer> {


}
