package com.example.freelancerfinder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FfRepo extends JpaRepository<Ff,String>{
    
}
