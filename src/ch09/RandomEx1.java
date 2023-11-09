package ch09;

import java.util.Random;

public class RandomEx1 {
    public static void main(String[] args){
        Random rand = new Random(1);
        Random rand2 = new Random(1);

        //Math.Random과 다르게
        //Random에서 Random값을 받을때  종자값을 줄 수 있다. 종자값이 같으면 같은 패턴의 난수값이 반환된다.
        System.out.println("= rand =");
        for(int i = 0; i < 5; i++){
            System.out.println(i + ":" + rand.nextInt());
        }

        System.out.println();
        System.out.println("= rand2 =");
        for(int i = 0; i < 5; i++){
            System.out.println(i + ":"+ rand2.nextInt());
        }
    }
}
