package com.market.market.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Getter
@Setter
@Data
@Entity

public class Invoice {
    Integer id;
    @Autowired
    Customer customer;
    List<Item> itemList;
}
