package com.devsuperior.dsmeta.config.services;

import com.devsuperior.dsmeta.config.repositories.SaleRepository;
import com.devsuperior.dsmeta.entities.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository sr;

    public List<Sale> findSales(){
        return sr.findAll();
    }
}
