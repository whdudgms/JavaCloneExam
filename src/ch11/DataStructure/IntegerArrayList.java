package ch11.DataStructure;

import java.util.Arrays;

public class IntegerArrayList implements IntegerListInterface {

    //변수 선언
    private Integer[] item; // 보관함
    private int numItems;  // 사용중인거
    private static final int DEFAULT_CAPACITY = 64; // 기본 길이

    public IntegerArrayList(){      //기본 생성자 기본 길이로 초기화
        item = new Integer[DEFAULT_CAPACITY];
        numItems = 0;
    }

    @Override
    public String toString() {
            return Arrays.toString(item);
    }

    public IntegerArrayList(int n) {    //주어진 길이로 초기화
        item = new Integer[n];
        numItems = 0;
    }

    //구현: 배열 리스트의 k번째 자리에 원소 x 삽입하기
    public void add(int index, Integer x) {
        if (numItems >= item.length || index < 0 || index > numItems) {
            /* 에러 처리 */
        }else {
            for (int i = numItems - 1; i >= index; i--) {
                item[i + 1] = item[i];
            }
            item[index] = x;
            numItems++;
        }
    }

    //배열 리스트의 맨 뒤에 요소 추가하기
    public void append(Integer x) {
        if (numItems >= item.length) {
            /* 에러 처리 */
        }else {
            item[numItems++] = x;
        }
    }

    //배열 리스트 K번재 원소 삭제하기
    public Integer remove(int index) {
        if (isEmpty() || index < 0 || index > numItems - 1) {
            return null;
        }else{
            Integer tmp = item[index];
            for (int i =  index; i <= numItems-2; i++){
                item[i] = item[i + 1];
            }
            item[(numItems--)-1] = null;
            return tmp;
        }
    }

    //배열 리스트에서 원소 x삭제하기
    public boolean removeItem(Integer x) {
        int k = 0;
        while (k < numItems && item[k].compareTo(x) != 0) {
            k++;
        }
        if (k == numItems) {
            return false;
        }else {
            for (int i = k; i <= numItems - 2; i++) { //i = 2  4
                item[i] = item[i + 1];
            }
            item[(numItems--)-1] = null;
            return true;
        }
    }

    //구현 :  배열 리스트이 i번째  원소 알려줘기
    public Integer get(int index) {
        if (index < numItems || index > 0) {
            return item[index];
        }else {
            return null;
        }
    }

    ///배열 리스트의 i번째 원소를 x로 대체하기
    public void set(int index, Integer x){
        if (index >= 0 ||  index < numItems -1){
            item[index] = x;
        }else{
            /* 에러 처리 */
        }
    }

    // 원소 x가 배열 리스트의 몇 번째 원소인지 알려주기
    private final int NOT_FOUND = 12345;

    public int indexOf(Integer x) {
        int  k = 0;
        while( item[k].compareTo(x) != 0 && k < numItems)
            k++;
        if (k == numItems)
            return NOT_FOUND;
        else
            return k;
    }

    public int len() {
        return numItems;
    }

    public boolean isEmpty(){
        return numItems == 0;
    }

    public void clear(){
        item = new Integer[item.length];
        numItems = 0;
    }

    public static void main(String[] args) {
        IntegerListInterface list = new IntegerArrayList(10);

        list.add(0, 300);
        list.add(0, 200);
        list.add(0, 100);

        list.append(500);
        list.append(600);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.append(700);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        System.out.println(list.removeItem(600));
        System.out.println(list);

    }
}
