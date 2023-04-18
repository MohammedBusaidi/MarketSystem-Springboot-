package com.market.market.Services;

import com.market.market.Models.Item;
import com.market.market.Models.Market;
import com.market.market.Repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
    public Item getItemById(Integer id) {
        return itemRepository.findById(id).get();
    }
}
