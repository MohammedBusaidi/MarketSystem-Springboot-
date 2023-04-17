package com.market.market.Services;

import com.market.market.Models.Invoice;
import com.market.market.Repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;

    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }
}
