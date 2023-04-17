package com.market.market.Controllers;

import com.market.market.Models.Invoice;
import com.market.market.Services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
