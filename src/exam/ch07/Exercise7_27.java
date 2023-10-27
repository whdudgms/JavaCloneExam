package exam.ch07;

class Outer1{
    int value = 10;

    class Inner1{
        int value = 20;
        void method1(){
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer1.this.value);
        }
    }// Inner 끝
}// Outer 끝
public class Exercise7_27 {
    public static void main(String[] args) {

        Outer1.Inner1 inner = new Outer1().new Inner1();
        inner.method1();
    }
}
