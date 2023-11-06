package aafree;

public class try123 {


    int x = 123;

    //int x = 11; 중복 선언 불가능 자바스크립트는 가능.

    public static void main(String[] agrs){
        boolean kk = true;
        boolean kk1 = kk && false;

        //자바스크립트랑 다르다. 자바스크립에서 실행되는게 안 될 수 있당!

        System.out.println();

        new try123().asdasd();
    }
    // 메서드에서 클래스의 멤버변수 참조
    // 자바는 클래스로 이루어져있고 멤버변수 메서드 생성자 초기화 블럭 등으로 구성
    void asdasd(){
        int x = 3;
        //lv에 접근
        System.out.println(x);
        //this.iv에 접근
        System.out.println(this.x);
    }
}
