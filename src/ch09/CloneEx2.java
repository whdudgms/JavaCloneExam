package ch09;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CloneEx2 {
    public static void main(String[] args){
        Integer[] arr = {new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5)};

        Integer[] arrClone = arr.clone();
        arrClone[0] = new Integer(6);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}
