package ch09;


// equals메서드를 오버라이틍해서 값을 비교하게 만들면 두 다른 객체의 iv요소가 같으면
//true를 반환하게 만들 수 있다.
public class EqualsEx1 {
    public static void main(String[] args ){
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if(v1.equals(v2)){
            System.out.println("v1과 v2는 같습니다.");
        }else{
            System.out.println("v1과 v2는 다릅니다.");
        }

        v2 = v1;

        if(v1.equals(v2)){
            System.out.println("v1과 v2는 같습니다.");
        }else{
            System.out.println("v1과 v2는 다릅니다.");
        }

    }
}


class Value{
    int value;

    Value(int value){
        this.value = value;
    }
}
