package com.task.controller;

public class userIn {
    public static String nameIn(){
        String[] studentName ={"老王","小明","小红", "大头", "小头","老大","飞明","成红", "拿头", "二子"};
        String outName =studentName[(int)(10*Math.random())];
        return outName;
    }
}
