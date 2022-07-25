package com.jiash.productservice.service;

import com.jiash.productservice.enumeration.EProductsStatus;
import org.springframework.ui.Model;

public interface CaseService {
    void findAllCases (EProductsStatus productStatus, Integer pageNumber, Model model);
    void findCaseById (Long caseId, Model model);
}
