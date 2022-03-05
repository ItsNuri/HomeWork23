package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> randomSandar = new ArrayList<Integer>();
        ArrayList<Integer> evenSandar = new ArrayList<Integer>();
        ArrayList<Integer> soSandar = new ArrayList<Integer>();

        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int a = random.nextInt(100);
            randomSandar.add(a);
            if (a%2 == 0) {
                evenSandar.add(a);
            }
            else {
                soSandar.add(a);
            }
        }
        System.out.println("Random sandar: " + randomSandar + " ");
        System.out.println("Zhup sandar: " + evenSandar + " ");
        System.out.println("Tak sandar: " + soSandar + " ");
    }
}






