package com.market.market.Controllers;

import com.market.market.Models.Invoice;
import com.market.market.Services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "invoice")
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Invoice> findInvoices() {
        return invoiceService.getAllInvoices();
    }
    @GetMapping(value = "getById")
    public Invoice getInvoiceById(@RequestParam Integer id) {
        return invoiceService.getInvoiceById(id);
    }
}
