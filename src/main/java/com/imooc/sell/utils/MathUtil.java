package com.imooc.sell.utils;

/**
 * @author 要子康
 * @description MathUtil
 * @since 2019/10/31 22:32
 */
public class MathUtil {

    private static final Double MONEY_RANGE = 0.01;

    public static Boolean equal(Double d1, Double d2){
        Double result = Math.abs(d1 - d2);
        if (result < MONEY_RANGE){
            return true;
        }else {
            return false;
        }
    }
}
