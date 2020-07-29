package com.nlc;

import java.util.Map;

public class DiscountOnTravelCard extends Promotion {
    @Override
    public Double getPriceAfterDiscount(Map<String,Integer> countMap, Double price)
    {
        if (price <= 0) {
             price= getTotalPrice(countMap);
        } ;
        for (Map.Entry<String,Integer> mapElement : countMap.entrySet())
        {
            String key = mapElement.getKey();
            Integer value=mapElement.getValue();
             if (key.equals("001")&& value>=2)
            {
                System.out.println(key +"  "+value);
                Double discounTedPerunit= 9.25-8.50;
                price=price-discounTedPerunit*value;
                System.out.println("Price disounted on Travel card :"+discounTedPerunit*value);
            }
            }
        System.out.println(price);
          return price;
        }

    }


