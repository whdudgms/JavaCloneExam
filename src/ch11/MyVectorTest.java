package ch11;

import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class MyVectorTest {


    //TDD
    //1. given - 어떤 조건이나 상황이 주졌을 때

    //2. test - 테스트 실행

    //3. assert -  결과 확인


    //추가하는 경우
    @Test
    public void addTest(){
       //MyVector mv = new MyVector();
        Vector mv = new Vector();

        for(int i = 0; i < 100_0000; i++) {
            mv.add("Str"+i);
        }
        assertEquals(mv.size() ,100_0000);
        assertEquals(mv.capacity() , 1310720);

    }


    //추가했다가 삭제하는 경우
    @Test
    public void addAndRemove(){
        //MyVector mv = new MyVector();
        Vector mv = new Vector();

        for(int i = 0; i < 50000; i++) {
            mv.add(("STR"+i));
        }
        for(int i = 0; i < 49999; i++) {
            mv.remove(("STR"+i));
        }

        //일부로 1개 남겨놓고 해봄
        assertEquals(mv.size() ,1);
        //10만부터 엄청 느리거나 잘 안됌
    }

        //값을 늘려서 size 전체길이랑 같거나 더 크면 길이를 2배로 증가.. 몇번 전체 길이만큼 채우는지에 따라서  16 * 2^n이라고 보면된다. 여기서 n은 전체 길이를 채우는 횟수
    @Test
    public void sizeCheck(){
        //MyVector mv = new MyVector();
        Vector mv = new Vector();

        for (int j = 0; j < 2222 ; j++) { // Vector은 증가시 마다 용량이 큰 배열로 변환하나보당
                mv.add("STR" + j); // 16 32 64 128 256 512 1024 2048
            }
        assertEquals(mv.size() , 2222);
    }

}


