package com.automationcc.Streamtxt;

import java.util.Arrays;
import java.util.List;

public class Maxnumber {
    public static void main(String[] args) {
        List<Integer> numberlist = Arrays.asList(2,3,4,7,87,23,32);
        int max = numberlist.stream().max(Integer::compareTo).get();
        System.out.println(max);




    }
}
