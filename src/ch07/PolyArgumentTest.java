package ch07;

public class PolyArgumentTest {
    public static void main(String[] args){
        Buyer b = new Buyer();

        b.buy(new Tv1());
        b.buy(new Computer1());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
    }
}


class Product1{
    int price;
    int bonusPoint;

    Product1(int price){
        this.price = price;
        this.bonusPoint = (int)(price/10.0);
    }
}

class Tv1 extends Product1{
    Tv1(){
        super(100);
    }

    public String toString(){
        return "TV";
    }

}

class Computer1 extends Product1 {
    Computer1() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product1 p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하였습니다");
    }
}







