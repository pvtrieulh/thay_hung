package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

public class Constant {
    public static int FREE = 0;
    public static int BUSY = 1;
    public static List<Integer> STATUS = new ArrayList() {
        {
            add(FREE);
            add(BUSY);
        }
    };
}
