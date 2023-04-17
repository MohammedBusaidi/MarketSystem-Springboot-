package com.market.market.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity

public class Item {
    Integer id;
    String name;
    double price;
    float quantity;
}
