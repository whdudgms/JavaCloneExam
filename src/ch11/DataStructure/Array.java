package ch11.DataStructure;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        //다양한 배열 초기화 방법
        int[]  numbers1 = new int[4]; // 배열은 객체.
        int[] numbers2 = {1, 2,3 ,4 ,5, 6, 7};
        int[] numbers3 = new int[]{1,2,3,4,5,6};


        System.out.println(numbers1.length);
        System.out.println(numbers2.length);
        System.out.println(numbers3.length);


        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers1));

        String[] strings = new String[4];

        numbers1[0] = 10;

    }
}
