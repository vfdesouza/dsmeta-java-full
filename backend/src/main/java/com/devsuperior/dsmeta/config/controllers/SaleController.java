package com.devsuperior.dsmeta.config.controllers;

import com.devsuperior.dsmeta.config.services.SaleService;
import com.devsuperior.dsmeta.entities.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    SaleService ss;

    @GetMapping
    public List<Sale> findSales() {
        return ss.findSales();
    }
}
