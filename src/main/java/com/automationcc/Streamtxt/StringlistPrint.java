package com.automationcc.Streamtxt;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringlistPrint {

    public static void main(String[] arg) {
        List<String> mylist = Arrays.asList("Dehemi", "Imalka", "Sandamini", "Shana");
        mylist.forEach(System.out::println);
        System.out.println("------------------------------------");

      //  Collections.reverse(mylist);
      //  mylist.forEach(System.out::println);


        // List<String> reverselist = IntStream.range(0, mylist.size()).mapToObj(i -> mylist.get(mylist.size() - 1 - i)).collect(Collectors.toList());
        // reverselist.forEach(System.out::println);
        //System.out.println("------------------------------------");

        List<String> upperlist = mylist.stream().map(String::toUpperCase).toList();
        upperlist.forEach(System.out::println);
        System.out.println("------------------------------------");

        List<String> lowerlist = mylist.stream().map(String::toLowerCase).toList();
        lowerlist.forEach(System.out::println);
        System.out.println("------------------------------------");

        String list = mylist.stream().collect(Collectors.joining(" "));
        System.out.println(list);
    }
}