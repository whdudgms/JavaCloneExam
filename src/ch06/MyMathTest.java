package ch06;

// divide매개변수는 double인데 인자로 long타입을 전달해줘도 자동형변환때문에 괜찮다.
public class MyMathTest {
    public static void main(String[] args){
    MyMath mm = new MyMath();
    long result1 = mm.add(5L, 3L);
    long result2 = mm.subtract(5L, 3L);
    long result3 = mm.multiply(5L,3L);
    double result4 = mm.divide(5L, 3L);
    System.out.println("add(5L, 3L) = "      + result1);
    System.out.println("subtract(5L, 3L) = " + result2);
    System.out.println("multiply(5L, 3L) = " + result3);
    System.out.println("divide(5L, 3L) = "   + result4);
    }
}

class MyMath{
    long add(long a, long b){
        long result = a + b;
        return result;
    }
    // result 변수를 새로 만들지 않고 return 값으로 연산을 줘도 연산해서 반환한다.
    long subtract(long a, long b){
        return a -b;
    }
    long multiply(long a, long b){
        return a * b;
    }

    double divide(double a, double b){
        return a / b;
    }
}
