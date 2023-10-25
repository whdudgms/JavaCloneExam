package ch06;

class Data1 {
    int value;
}
class Data2{
    int value;
    Data2(int x){
        value = x;
    }
}
public class ConstructorTest {
    public static void main(String[] args){
        Data1 d1 = new Data1();
      //  Data2 d2 = new Data2();     //에러가 발생하는 이유 매개변수를 같지 않는 생성자가 없으므로 발생한다. 따라서 기본생성자를 넣어주면 괜찮다.
    }

}
