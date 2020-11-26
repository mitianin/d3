package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PointsList list  = new PointsList();
        System.out.println(list + " " + list.size());

        list.add(new Point(11, 11));
        list.add(new Point(22, 22));
        list.add(new Point(33, 33));
        list.add(new Point(44, 44));
        list.add(new Point(55, 55));
        list.add(new Point(66, 66));
        list.add(new Point(77, 77));
        list.add(new Point(88, 88));
        list.add(new Point(99, 99));
        list.add(new Point(111, 111));
        list.add(new Point(222, 222));



        System.out.println(list + " " + list.size());

        list.remove(3);

        System.out.println(list + " " + list.size());

        list.set(5,new Point(0,0));

        System.out.println(list + " " + list.size());

        System.out.println(list.get(5) + " " + list.size());

        list.clear();
        System.out.println(list + " " + list.size());








    }
}
