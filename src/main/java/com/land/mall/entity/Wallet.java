package com.land.mall.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


@Data
public class Wallet implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 余额
     */
    private String balance;


}
