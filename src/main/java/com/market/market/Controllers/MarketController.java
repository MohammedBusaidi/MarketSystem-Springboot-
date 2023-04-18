package com.market.market.Controllers;

import com.market.market.Models.Market;
import com.market.market.Services.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.error.Mark;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "market")
public class MarketController {
    @Autowired
    MarketService marketService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Market> findMarkets() {
         return marketService.getAllMarket();
    }
    @GetMapping(value = "getById")
    public Market getMarketById(@RequestParam Integer id) {
        Market market = marketService.getMarketById(id);
        return market;
    }
//    @GetMapping(value = "getByName")
//    public Market getMarketByName(@RequestParam String name) {
//        Market market = marketService
//    }
}
