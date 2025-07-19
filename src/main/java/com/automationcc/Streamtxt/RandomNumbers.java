package com.automationcc.Streamtxt;

import com.google.common.base.Supplier;

import java.sql.SQLOutput;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Supplier<Integer> randomnu = () -> new Random().nextInt(0,10);
        for(int i=0; i<10; i++)
        {
            System.out.println(randomnu.get());
        }

    }
}
