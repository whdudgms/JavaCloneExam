package ch06;

import org.junit.Test;

import static org.junit.Assert.*;
public class MethodTest2 {

    //Q1. 세게의 정수를 받아서 중간 값을 반환하는 메서드 mid를 작성하고
    //테스트하시오.
    int mid(int x, int y,int z){
        if(x >= y){
            if(y >= z){
                return y;
            }else if(z >= x){
                return x;
            }else{
                return z;
            }
        }else if(x >= z){
            return x;
        }else if(y >= z ){
            return z;
        }else{
            return y;
        }
    }
    @Test
    public void test(){
        assertTrue(mid(3,2,1)==2);
    }
    @Test
    public void test1(){
        assertTrue(mid(2,3,1)==2);
    }
    @Test
    public void test2(){
        assertTrue(mid(1,1,2)==1);
    }
    @Test
    public void test3(){
        assertTrue(mid(1,3,2)==2);
    }

    @Test
    public void test4(){
        assertTrue(mid(5,5,5)==5);
    }

    @Test
    public void test5(){
        assertTrue(mid(19,3,19)==19);
    }

    @Test
    public void test6(){
        assertTrue(mid(9,3,19)==9);
    }
}
