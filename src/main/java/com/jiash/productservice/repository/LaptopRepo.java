package com.jiash.productservice.repository;

import com.jiash.productservice.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Long> {
    List<Laptop> findByAmountAfter (Integer amount);
    List<Laptop> findByAmount (Integer amount);
}
