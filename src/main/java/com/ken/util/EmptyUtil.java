package com.ken.util;


import java.util.Collection;
import java.util.Map;

/**
 * 工具类：判断bean，数组，集合是否为空
 */
public class EmptyUtil {

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

    public static boolean isEmpty(Object[] obj) {
        return obj == null || obj.length <= 0;
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }
}
