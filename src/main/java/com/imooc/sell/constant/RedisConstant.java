package com.imooc.sell.constant;

/**
 * @author 要子康
 * redis常量
 * @description RedisConstant
 * @since 2019/11/12 09:47
 */
public interface RedisConstant {

    String TOKEN_PREFIX = "token_%s";

    Integer EXPIRE = 7200; //两小时
}
