package ch09;

// Cloneable 구현
class Point implements Cloneable{
    int x,y;

    Point(int x ,int y){
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
        Point original = new Point(3,5);
        Point copy = (Point)original.clone();
        System.out.println(original);

        System.out.println(copy);
    }
}
