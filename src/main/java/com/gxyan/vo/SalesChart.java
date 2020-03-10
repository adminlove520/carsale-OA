package com.gxyan.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author gxyan
 * @date 2020/2/11 12:10
 */
@Data
public class SalesChart {
    private String date;

    private BigDecimal income;

    private BigDecimal expenditure;

    private BigDecimal profit;
}
