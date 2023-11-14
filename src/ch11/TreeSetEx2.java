package ch11;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int i = 0; i < score.length; i++) {
            set.add(new Integer(score[i]));
        }
        System.out.println("50 언더:"	+ set.headSet(new Integer(50)));
        System.out.println("50º오바  :"	+ set.tailSet(new Integer(50)));
    }
}
