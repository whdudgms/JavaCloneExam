package ch06;

// 인스턴스 변수들에 접근 가능한 것은 im이다. cm은 접근 불가능 정 꼭 접근을 원한다면 인스턴스 생성후 접근
// 만약에 인스턴스 메서드에도 매개변수가 a,b로 선언되어 있었다면 매개변수 a,b와 iv a,b를
// 구별하기 위해서 this.a this.b 이런식으로 접근한다.
class MyMath2 {
    long a,b;

    long add() {return a + b;}
    long subtract(){return a - b;}
    long multiply(){return a * b;}
    double divide(){return a / b;}

    static long add(long a, long b){ return a + b;}
    static long subtract(long a, long b){return a - b;}
    static long multiply(long a, long b){return a * b;}
    static double divide(double a, double b){return a / b;}
}

class MyMathTest2{
    public static void main(String[] args){
        //클래스메서드 호출. 인스턴스 생성 없이 호출가능
        System.out.println(MyMath2.add(200L,100L));
        System.out.println(MyMath2.subtract(200L,100L));
        System.out.println(MyMath2.multiply(200L,100L));
        System.out.println(MyMath2.divide(200.0,100.0));

        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        //인스턴스메서드는 객체생성 후에만 호출이 가능함.
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());

    }
}
