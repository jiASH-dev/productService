package com.jiash.productservice.repository;

import com.jiash.productservice.model.Memory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemoryRepo extends JpaRepository<Memory, Long> {
    List<Memory> findByAmountAfter (Integer amount);
    List<Memory> findByAmount (Integer amount);
}
