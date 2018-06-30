package com.ken.util;

import java.util.UUID;

public class CommonUtil {

    /**
     * 获取随机字符串uuid
     *
     * @return
     */
    public static String crateUUid() {
        return UUID.randomUUID().toString().toLowerCase().replaceAll("-", "");
    }

}
