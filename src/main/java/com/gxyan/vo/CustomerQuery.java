package com.gxyan.vo;

import lombok.*;

/**
 * @author gxyan
 * @date 2020/2/12 13:29
 */
@Data
public class CustomerQuery {
    private int page = 1;

    private int limit = 5;

    private Long id;

    private String name;

    private String phone;

    private String idCard;

    private String orderBy;
}
