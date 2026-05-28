package com.example.lib_a;

import com.example.lib_b.BUtils;

public class AUtils1 {

    public static String getTest1() {
        return "test1";
    }

    public static String getTest3() {
        return BUtils.getTestB1();
    }

}
