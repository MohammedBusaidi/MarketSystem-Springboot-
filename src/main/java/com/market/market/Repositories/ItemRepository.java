package com.market.market.Repositories;

import com.market.market.Models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;


@Controller
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
