package com.example.program;

import com.example.model.IndentationInputAndObject;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class IntegerComparatorTest {

    public static Comparator<Integer> COMPARATOR = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 == o2) return 0;
            if (o1 == null) return -1;
            if (o2 == null) return 1;
            return o1.compareTo(o2);
        }
    };

    private TreeMap<Integer,List<IndentationInputAndObject>> inputMap;

    public IntegerComparatorTest(List<IndentationInputAndObject> flatInput, List<String> answers) {
        inputMap = new TreeMap(COMPARATOR);
    }

    public static void main(String args[]) {
        List<Integer> list = new LinkedList<>();

        for (String arg: args) {
            int value = Integer.parseInt(arg);
            list.add(value);
        }
        Collections.sort(list, COMPARATOR);

        if (list.size() > 0) {
            System.out.println("%%%%%%%%%%%%%%");
            int counter = 0;
            for (Integer val: list) {
                counter++;
                System.out.printf(counter == list.size() ? "%d" : "%d,", val);
            }
            System.out.println("\n%%%%%%%%%%%%%%");
        }
    }
}
