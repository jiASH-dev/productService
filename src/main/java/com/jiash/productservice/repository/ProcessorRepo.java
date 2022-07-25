package com.jiash.productservice.repository;

import com.jiash.productservice.model.Processor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcessorRepo extends JpaRepository<Processor, Long> {
    List<Processor> findByAmountAfter (Integer amount);
    List<Processor> findByAmount (Integer amount);
}
