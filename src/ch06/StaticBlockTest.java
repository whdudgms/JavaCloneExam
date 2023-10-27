package ch06;

// 클래스 안에는 메서드,변수,초기화블록,생성자 이렇게 존재한다.
// 배열이 있을 경우에는 블록으로 초기화 해줘야한다.

// iv 배열도 초기화 할라믄 {},생성자를 활용해서 해야 한다!
public class StaticBlockTest {

    static int[] arr = new int[10];
    int[] arr2 = new int[10]; // 얘도 그냥 초기화는 못 함 블록이나 생성자에서 해야함.

    static  {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
    }

    public static void main(String args[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr["+i+"] :" +arr[i]);
        }
    }
}
