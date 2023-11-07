package ch08;

public class ExceptionEx13 {
    public static void main(String[] args){




        try{
            method1();
        }catch( Exception e ){

            e.printStackTrace();

            System.out.println("main메서드에서 예외가 처리 되었습니다.");
            System.out.println();
            System.out.println("main메서드에서 예외가 처리 되었습니다.");
            System.out.println();

            e.printStackTrace();

        }


        System.out.println("예외 처리를 해서 프로그램이 정상적으로 동작은 합니다!");

    }

    static void method1() throws  Exception{
        throw new Exception();
    }
}
