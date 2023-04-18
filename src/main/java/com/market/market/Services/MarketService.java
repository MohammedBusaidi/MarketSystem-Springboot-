package com.market.market.Services;

import com.market.market.Models.Market;
import com.market.market.Repositories.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MarketService {
    @Autowired
    MarketRepository marketRepository;
    public List<Market> getAllMarket() {
         return marketRepository.findAll();
    }

    public Market getMarketById(Integer id) {
        return marketRepository.findById(id).get();
    }
//    public Market getMarketByName(String name) {
//        return marketRepository.
//    }
}
