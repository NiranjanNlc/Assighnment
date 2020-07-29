package com.nlc;

import java.util.Map;

public abstract class Promotion {
    Double getTotalPrice(Map<String,Integer> countMap) {
        Double price=0.00;
        for (Map.Entry<String,Integer> mapElement : countMap.entrySet()) {
            String key = mapElement.getKey() ;
            Integer value = mapElement.getValue();
            switch (key) {
                case "001":
                    price = price + 9.25 * value;
                    break; // optional

                case "002":
                    price = price + 45.00 * value;
                    break; // optional
                case "003":
                    price = price + 19.95 * value;
                    break; // optional
                // You can have any number of case statements.
                default: // Optional
                    // Statements
            }
        }
        System.out.println("total price"+price);
        return price;
    }

    abstract Double getPriceAfterDiscount(Map<String,Integer>  countMap, Double price);
}




