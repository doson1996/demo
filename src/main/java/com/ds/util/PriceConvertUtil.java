package com.ds.util;

import com.ds.constant.MonetaryUnit;

/**
 * 价格转换工具
 * @author ds
 */
public class PriceConvertUtil {

    /**
     * 转换为人民币格式 例如: ￥0.00
     * @param price
     * @return ￥x.xx
     */
    public static String convertRMB(Integer price) {
        String result = "￥" + (price / MonetaryUnit.YUAN) + "." ;
        // 价格在角单位不为零 0.11
        if (price % MonetaryUnit.YUAN >= MonetaryUnit.JIAO) {
            return result + (price % MonetaryUnit.YUAN);
        }
        // 价格在角单位为零 0.01
        return  result + "0" + (price % MonetaryUnit.YUAN);
    }

}
