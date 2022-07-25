package com.jiash.productservice.repository;

import com.jiash.productservice.model.Motherboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotherboardRepo extends JpaRepository<Motherboard, Long> {
    List<Motherboard> findByAmountAfter (Integer amount);
    List<Motherboard> findByAmount (Integer amount);
}
