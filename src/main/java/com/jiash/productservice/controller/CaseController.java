package com.jiash.productservice.controller;

import com.jiash.productservice.enumeration.EProductsStatus;
import com.jiash.productservice.service.CaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CaseController {

    private final CaseService caseService;


    @GetMapping("/cases")
    public String findAllCases (@RequestParam EProductsStatus productStatus, @RequestParam Integer pageNumber, Model model) {
        caseService.findAllCases(productStatus, pageNumber, model);
        return "products";
    }

    @GetMapping("/cases/{caseId}")
    public String findCaseById (@PathVariable Long caseId, Model model) {
        caseService.findCaseById(caseId, model);
        return "view";
    }
}
