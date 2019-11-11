package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author 要子康
 * @description SellerInfo
 * @since 2019/11/11 09:45
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String Id;

    private String username;

    private String password;

    private String openid;

}
