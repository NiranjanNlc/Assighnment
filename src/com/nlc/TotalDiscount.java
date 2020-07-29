package com.nlc;

import java.util.Map;

public class TotalDiscount extends Promotion {
    @Override
    public Double getPriceAfterDiscount(Map countmap, Double price)
    {

        if (price < 0) {
            super.getTotalPrice(countmap);
        }
        if(price>60)
        {
            System.out.println("Discount on total exceeding 60 "+ 0.1*price);
            return price- 0.1*price;
        }
        return price;

    }
}
