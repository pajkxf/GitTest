package com.play;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author V
 */
public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> list1 = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        list1.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        list1.forEach(i-> System.out.println(i));
    }
}
