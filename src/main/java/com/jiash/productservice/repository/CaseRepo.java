package com.jiash.productservice.repository;

import com.jiash.productservice.model.Case;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseRepo extends JpaRepository<Case, Long> {
    Page<Case> findByAmountAfter (Integer amount, Pageable page);
    Page<Case> findByAmount (Integer amount, Pageable page);
    @Query(nativeQuery = true, value = "SELECT count(*) from corps where corps.amount > 0")
    Integer findCasesAmountAfterZero();
    @Query(nativeQuery = true, value = "SELECT count(*) from corps where corps.amount == 0")
    Integer findCasesAmountZero();
}
