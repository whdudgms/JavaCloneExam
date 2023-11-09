package ch09;


// String 을 "" > 리터럴로 생성해서 비교하면 constantPool에 있는 같은 객체를 참조하게 되어서
// 주소 비교를 하거나 값비교를 해도 모두 결과는 true가 된다.
// String를 new 연산자로 생성하면 무조건 새로운 객체가 만들어 지므로
// 문자열이 같아도 주소가 다르므로 주소를 비교하는  ==  연산자로는 결고가 fasle가 된다.
//equals의 경우 원래는 주소비교인데 오버라이딩해서 값을 비교하므로 문자열만 같으면 true가 된다
// 집접 실행해보면 이해에 도움이 된다.
public class StringEx1 {
    public static void main(String[] args)
    {
        String str1 = "abc";
        String str2 = "abc";

        System.out.println("String str1 = \"abc\";");
        System.out.println("String str1 = \"abc\";");


        System.out.println("str1 == str2 ?  " + (str1 == str2));
        System.out.println("str1.equals(str2) ? " + str1.equals(str2));
        System.out.println();

        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println("String str3 = new String(\"abc\");");
        System.out.println("String str4 = new String(\"abc\");");

        System.out.println("str3 == str4 ? " + (str3 == str4));
        System.out.println("str3.equals(str4) ? " + str3.equals(str4));
    }
}
