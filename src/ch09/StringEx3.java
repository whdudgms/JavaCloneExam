package ch09;

//빈 char배열
//빈 문자열 String
// 아무리 길어가 없어도 null보다는 났다
// 1. null관련 에러 발생 x 2. 관련 메서드는 사용가능하다.
public class StringEx3 {
    public static void main(String[] args){
        char[] cArr = new char[0];
        String s = new String(cArr);

        System.out.println("cArr.length="+cArr.length);
        System.out.println("@@@"+s+"@@@");
    }
}
