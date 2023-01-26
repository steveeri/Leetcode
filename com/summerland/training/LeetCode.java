package com.summerland.training;

import java.util.Date;

public class LeetCode {

    public static void main (String[] args) {

        System.out.println("main called");

        Problem prob = new LongestSubstring();

        Long num = new Long();
        Date dat = new Date(num);
        System.out.println(dat);
        
        prob.prepare();
        prob.solve();
        prob.report();

        System.out.println("main ended");
    }
}
