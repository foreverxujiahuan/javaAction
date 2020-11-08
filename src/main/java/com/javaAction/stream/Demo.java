package com.javaAction.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=100;i++) {
            list.add(i);
        }
        List<Integer> oddList = list.stream().
                filter(d -> d%2 != 0).
                collect(Collectors.toList());
        List<Integer> evenList = list.stream().
                filter(d -> d%2 == 0).
                collect(Collectors.toList());
        System.out.println(oddList);
        System.out.println(evenList);
        List<Integer> oddAddOneList = list.stream().
                filter(d -> d%2 != 0).
                map(Demo::addOne).
                collect(Collectors.toList());
        System.out.println(oddAddOneList);
    }

    private static int addOne(int n){
        return n+1;
    }
}
