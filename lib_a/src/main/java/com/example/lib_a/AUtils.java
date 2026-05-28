package com.example.lib_a;

import com.example.lib_b.BUtils;

public class AUtils {

    public static String getTestA1() {
        return "test_a";
    }

    public static String getTestA2() {
        return BUtils.getTestB2();
    }

}




