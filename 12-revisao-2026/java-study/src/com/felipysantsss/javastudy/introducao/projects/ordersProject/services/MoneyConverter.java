package com.felipysantsss.javastudy.introducao.projects.ordersProject.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

// convert String -> BigDecimal
public class MoneyConverter {
    public static BigDecimal converter(String money){
        try {
            String cleanStringMoney = money.replace(".", "").replace(",", ".");
            BigDecimal realMoney = new BigDecimal(cleanStringMoney);
            if (realMoney.signum() <= 0){
                throw new IllegalArgumentException("Enter a positive value!");
            }
            return realMoney.setScale(2, RoundingMode.HALF_EVEN);
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Invalid value!");
        }
    }
}
