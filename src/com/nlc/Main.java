package com.nlc;

import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<String>();
        List<Promotion> promotionList = new ArrayList<>();
        promotionList.add(new DiscountOnTravelCard());
        promotionList.add(new TotalDiscount());
        CheckOut checkOut = new CheckOut(promotionList);
        System.out.println("Our items and code :");
        System.out.println("Product code | Name | Price ----------------------------------------------------------\n" +
                "001 | Travel Card Holder | £9.25\n" +
                "002 | Personalised cufflinks | £45.00\n" +
                "003 | Kids T-shirt | £19.95");
        System.out.println("Enter the product code seprated by spaces :");
        String s = "";
        do {
            System.out.println("Enter the product code otherwise press n");
            s = in.nextLine();
             checkOut.scanItem(s);
        } while (!s.equalsIgnoreCase("n"));
//
        Double totalPrice = checkOut.calculate();
        System.out.println(totalPrice);
    }
}
