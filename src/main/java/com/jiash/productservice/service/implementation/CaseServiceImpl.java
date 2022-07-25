package com.jiash.productservice.service.implementation;

import com.jiash.productservice.enumeration.EProductsStatus;
import com.jiash.productservice.model.Case;
import com.jiash.productservice.repository.CaseRepo;
import com.jiash.productservice.service.CaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CaseServiceImpl implements CaseService {

    private final CaseRepo caseRepo;

    @Override
    public void findAllCases(EProductsStatus productStatus, Integer pageNumber, Model model) {

        List<Case> cases;
        Integer casesAmount;

        if (productStatus == EProductsStatus.IN_STOCK) {
            cases = caseRepo.findByAmountAfter(0, PageRequest.of(pageNumber - 1, 5)).getContent();
            if (cases.isEmpty()) {
                model.addAttribute("casesError", "На данный момент корпусов в наличии не имеется.");
                return;
            }
            casesAmount = caseRepo.findCasesAmountAfterZero();
        } else {
            cases = caseRepo.findByAmount(0, PageRequest.of(pageNumber - 1, 5)).getContent();
            if (cases.isEmpty()) {
                model.addAttribute("casesError", "На данный все корпуса в наличии");
                return;
            }
            casesAmount = caseRepo.findCasesAmountZero();
        }

        model.addAttribute("cases", cases);
        if ((casesAmount / 5.0 * 10) % 10 > 0) {
            model.addAttribute("casesAmount", casesAmount / 5 + 1);
        } else {
            model.addAttribute("casesAmount", casesAmount / 5);
        }
        model.addAttribute("currentPageNumber", pageNumber);
    }

    @Override
    public void findCaseById(Long caseId, Model model) {
//        model.addAttribute("case", caseRepo.findByAmount(0));
    }
}
