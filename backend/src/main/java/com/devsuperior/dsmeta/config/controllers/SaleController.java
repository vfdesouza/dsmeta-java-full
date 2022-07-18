package com.devsuperior.dsmeta.config.controllers;

import com.devsuperior.dsmeta.config.services.SMSService;
import com.devsuperior.dsmeta.config.services.SaleService;
import com.devsuperior.dsmeta.entities.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleService ss;
    @Autowired
    private SMSService smsService;

    @GetMapping
    public Page<Sale> findSales(
            @RequestParam(value = "minDate", defaultValue = "") String minDate,
            @RequestParam(value = "maxDate", defaultValue = "")String maxDate,
            Pageable pageable) {
        return ss.findSales(minDate, maxDate, pageable);
    }
    @GetMapping("/{id}/notification")
    public void notifySms(@PathVariable Long id) {
        smsService.sendSms(id);
    }

}
