package com.automationcc.Streamtxt;

import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

public class ListIntegerPrint {
    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(2,3,4,7,87,23,32);
        List<Integer> evenlist = mylist.stream().filter(x -> x%2 ==0).toList();
        evenlist.forEach(System.out::println);

        System.out.println("--------------");

        long coun =  evenlist.stream().count();
        System.out.println(coun);


    }
}
