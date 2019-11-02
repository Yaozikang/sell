package com.imooc.sell.utils;

import com.imooc.sell.enums.CodeEnum;

/**
 * @author 要子康
 * @description EnumUtil
 * @since 2019/11/5 09:38
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
        for (T each : enumClass.getEnumConstants()){
            if (code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
