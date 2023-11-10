package ch11.DataStructure;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args){
        // 배열을 이용한 arrayList는 데이터 추가 삭제에 시간이 오래걸린다.
        // 데이터에 접근하는 시간은 굉장히 빨리걸린다 index를 이용하기 때문.
        //size라는 값을 가지고 있다

        //Java ArrayList 사용하는 방법
        //Create

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers);

        numbers.add(1,50); //인덱스 1에 50 할당  순서 1. 인덱스의 데이터부터 쭉 먼저 한칸씩 뒤로 댕김   2. 데이터 추가
        numbers.add(1,55); //인덱스 1에 50 할당  순서 1. 인덱스의 데이터부터 쭉 먼저 한칸씩 뒤로 댕김   2. 데이터 추가


        numbers.remove(1);

        System.out.println(numbers);

        System.out.println(numbers.get(2));

        System.out.println(numbers.size());


        Iterator<Integer> it = numbers.iterator();

        while(it.hasNext()){
            Integer value = it.next();
            System.out.println("Iterator로 출력하는 거양   " +value);
        }


        for(int value:numbers){
            System.out.println(value);
        }

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }


    }

}
