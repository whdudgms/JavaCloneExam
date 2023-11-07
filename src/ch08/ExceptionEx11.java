package ch08;

//RuntionException의 경우 컴파일에는 문제가 없지만
// 이것 또한 예외 이므로 실행시 예외 발생해서 처리해주지 않으면
// 프로그램이 종료된다.
public class ExceptionEx11 {
    public static void main(String[] args){
        throw new RuntimeException();
    }
}
