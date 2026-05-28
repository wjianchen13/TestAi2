package com.example.lib_b;

import com.example.lib_c.CUtils;

public class BUtils {

    public static String getTestB1() {
        return "test_b_1";
    }

    public static String getTestB2() {
        return CUtils.getTestC();
    }

}
