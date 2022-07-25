package com.jiash.productservice.repository;

import com.jiash.productservice.model.PowerSupply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PowerSupplyRepo extends JpaRepository<PowerSupply, Long> {
    List<PowerSupply> findByAmountAfter (Integer amount);
    List<PowerSupply> findByAmount (Integer amount);
}
