package com.market.market.Controllers;


import com.market.market.Models.Item;
import com.market.market.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Item> findItems() {
        return itemService.getAllItems();
    }
    @GetMapping(value = "getAll")
    public Item getItemById(@RequestParam Integer id) {
    return itemService.getItemById(id);
    }

}