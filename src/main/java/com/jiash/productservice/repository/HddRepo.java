package com.jiash.productservice.repository;

import com.jiash.productservice.model.Hdd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HddRepo extends JpaRepository<Hdd, Long> {
    List<Hdd> findByAmountAfter (Integer amount);
    List<Hdd> findByAmount (Integer amount);
}
