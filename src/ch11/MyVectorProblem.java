package ch11;

import org.junit.Test;

public class MyVectorProblem {
}

class MyVector{
    Object[] objArr;
    int capacity;
    int size;


    int size(){
        return size;
    }

    int capacity(){
        return capacity;
    }

    boolean isEmpty(){
     return  size == 0;
    }

    //객체들 출력
    public String toString(){
        String result ="";
        for(int i = 0; i < size; i++){
            result += objArr[i]+" ,";
        }
        return result;
    }

    //지정된 index에 객체 반환
    Object get(int index){
        //capacity 범위를 넘는 경우 어쩔지
        return objArr[index];
    }

    MyVector(){
        this(16);
    }
    MyVector(int capacity){
        this.capacity = capacity;
        objArr = new Object[capacity];
        size = 0;
    }


    void add(Object obj){
        // 용량관련 문제 해결
        if(size >= objArr.length){
            setCapacity(this.capacity*2);
        }
        //null을 전달받은 경우도 있을 수 있으니 size만 보고 추가.
        //추가
        objArr[size++] = obj;
    }


    // 용량을 늘려줄 메서드 정의
    // 1. 배열 용량 늘리기. 2. 배열 복사.
    void setCapacity(int capacity){
        Object[] newobj = new Object[capacity];

        for(int i = 0; i < objArr.length; i++){
            newobj[i] = objArr[i];
        }

        objArr = newobj;
        this.capacity = capacity;
    }


    //   없는 경우  삭제 성공 실패
    boolean remove(Object obj){
        int index = indexOf(obj); // -1 또는 index번호
        if(index == -1)return false;
        // 해당 인덱스를 쭉 덮어쓰기
        for(int i = index; i < objArr.length -1; i++){
                    objArr[i] = objArr[i+1];
        }
        objArr[--size] = null;
        return true;
    }

    // 없는 경우 -1 // 범위 초과하는 경우 에러 발생할텐데 나중에 고민 // 정상적인 경우
    int indexOf(Object obj){
        int flag = -1; // -1 없는 경우
        for(int i = 0; i < size; i++){
            if(objArr[i].equals( obj))
                flag = i;
        }
        System.out.println(flag);
        return flag;
    }

}
