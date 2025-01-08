package org.example;

import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        //인덱스 번호 몰라도 되요
        list.add(30);
        list.add(44);
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);


        //Arrays.toString() 배열의 내용물
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("------------------------");
        list.remove(Integer.valueOf(44));

        Collections.sort(list); //Dual-pivot QuickSort Java 7 부터

        System.out.println(list);
        System.out.println(list.size());

    }
}







