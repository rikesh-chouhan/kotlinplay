package com.example.program;

public class WindowFunction {

    int theBadOne = 0;

    WindowFunction(int badIndex) {
        theBadOne = badIndex;
    }

    // input = startIndex EndIndex badIndex
    // startIndex<= badIndex <=EndIndex
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        int badIndex = Integer.parseInt(args[2]);
        WindowFunction function = new WindowFunction(badIndex);
        System.out.println("What is the index of bad one? "+ function.findBadIndex(start, end));
    }

    public int findBadIndex(int start, int end) {
        for (int i=start; i<=end; i++) {
            if (isBad(i)) {
                return i;
            }
        }
        return -1;
    }

    boolean isBad(int index) {
        return index == theBadOne;
    }


}
