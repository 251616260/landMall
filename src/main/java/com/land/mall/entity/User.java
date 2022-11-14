package com.land.mall.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.models.auth.In;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String passWord;

    private String userName;

    /**
     * 手机号
     */
    private String phone;


}
