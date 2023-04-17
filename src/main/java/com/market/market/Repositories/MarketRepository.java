package com.market.market.Repositories;

import com.market.market.Models.Market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketRepository extends JpaRepository<Market,Integer> {
}
