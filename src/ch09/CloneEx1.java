package ch09;

import java.util.Arrays;

// Cloneable 구현
class point1 implements Cloneable{
    int x,y;

    point1(int x ,int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "x = "+ x + ", "+ "y = "+y;
    }

    //clone 오버라이딩
    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone(); // 조상 clone호출
        }catch(CloneNotSupportedException e){ // 예외처리 필수
        }
        return obj;
    }
}
public class CloneEx1 {
    public static void main(String[] args){

        int[] uuu = {1,2,3,4};
        int[] zzz = uuu.clone();

        System.out.println(Arrays.toString(uuu));
        System.out.println(Arrays.toString(zzz));


        zzz[0] = 22; // 복사해서 받은 객체 변경

        System.out.println(Arrays.toString(uuu));
        System.out.println(Arrays.toString(zzz)); // 배열의 복사도 깊은 복사


        point1 original = new point1(3,5);
        point1 copy = (point1)original.clone();
        copy.x = 15; // 깊은 복사가 된 것이다.
        System.out.println(original);

        System.out.println(copy);
    }
}
