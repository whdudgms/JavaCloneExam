package ch06;

// 스태틱 변수는 모든 클래스의 공통적인 값이다. 따라서 객체의 한 객체의 참조변수로 접근해서 static 변수를
// 바꾸더라도 다른 참조변수나 Class.static변수 사용시에 결과값이 모두 같다.
class CardTest {
    public static void main(String args[]){
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = "+ Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );

        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
    }
}

class Card{
    String kind ;
    int number;
    static int width = 100;
    static int height = 250;
}