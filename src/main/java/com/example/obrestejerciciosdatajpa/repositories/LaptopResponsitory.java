package com.example.obrestejerciciosdatajpa.repositories;

import com.example.obrestejerciciosdatajpa.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopResponsitory extends JpaRepository<Laptop, Long> {
}
