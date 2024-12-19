package com.example.carmanagement.repository;

import com.example.carmanagement.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    // Global Search Query
    @Query("SELECT c FROM Car c WHERE LOWER(c.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR LOWER(c.model) LIKE LOWER(CONCAT('%', :keyword, '%')) OR LOWER(c.color) LIKE LOWER(CONCAT('%', :keyword, '%')) OR LOWER(c.fuelType) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Car> searchByKeyword(@Param("keyword") String keyword);
}