package com.nlc;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class CheckOut {
    private List<Promotion> promotionrules;
    public List<Item> items = new ArrayList<>();
    private Double total;

    public CheckOut(List<Promotion> promotionslist) {
        this.promotionrules = promotionslist;
    }



    public Item scanItem(String itemCode)
    {
         Item item =new Item(itemCode);
         this.items.add(item);
         return item;
    }
 
    public Double calculate() {
        this.setTotal(0.00);
        List<String> codes = this.items.stream().map(Item::getItemCode).collect(toList());

        Map<String, Integer> countMap = new HashMap();
        for (String i : codes) {
            Integer j = countMap.get(i);
            countMap.put(i, (j == null) ? 1 : j + 1);
        }
   
        this.promotionrules.stream().forEach(promotion ->
                {
                    this.total = promotion.getPriceAfterDiscount(countMap ,this.total);
                }
        );
        return this.total;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}