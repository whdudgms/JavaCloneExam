package ch11;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector {

    //요소를 저장
    public Object push(Object item) {
        addElement(item);
        return item;
    }

    // 요소들 반환하고 제거
    public Object pop() {
        Object obj = peek();
        removeElementAt(size()-1);
        return obj;
    }



    //맨 마지막 요소를 반환 제거하지는 않는다.
    public Object peek(){
        int len = size();
        if (len == 0) {
            throw new EmptyStackException();
        }
        return elementAt(len - 1);
    }

    //텅비게 만듦
    public boolean empty() {
        return size() ==0;
    }

    //매개변수로 전달된 객체가 있는지 찾음.
    public int search(Object o){
        int i = lastIndexOf(o);

        if (i >= 0) {
            return size()-1;
        }
        return -1;
    }
}
