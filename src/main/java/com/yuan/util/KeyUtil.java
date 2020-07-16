package com.yuan.util;

import java.util.Random;

public class KeyUtil {
    public static synchronized String createUniqueKey(){//synchronized在多个订单产生时，保证线程安全
        Random random = new Random();
        Integer key = random.nextInt(900000) + 100000;
        return System.currentTimeMillis()+String.valueOf(key);
    }
}
