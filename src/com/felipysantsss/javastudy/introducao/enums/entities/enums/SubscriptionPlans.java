package com.felipysantsss.javastudy.introducao.enums.entities.enums;

import java.math.BigDecimal;

public enum SubscriptionPlans {
    PHOTOGRAPHER_PLAN(new BigDecimal("56.99"), 100, 1),
    AUDIOVISUAL_PLAN(new BigDecimal("119.90"), 250, 2),
    ENTERPRISE_PLAN(new BigDecimal("279.90"), 1024, 5);

    private BigDecimal price;
    private Integer maxGigabytes;
    private Integer accounts;

    SubscriptionPlans(BigDecimal price, Integer limitGigas, Integer limitAccounts) {
        this.price = price;
        this.maxGigabytes = limitGigas;
        this.accounts = limitAccounts;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getMaxGigabytes() {
        return maxGigabytes;
    }

    public Integer getAccounts() {
        return accounts;
    }
}
