package com.market.market.Repositories;

import com.market.market.Models.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface MarketRepository extends JpaRepository<Market,Integer> {
}
