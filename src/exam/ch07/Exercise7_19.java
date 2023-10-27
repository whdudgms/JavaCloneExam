package exam.ch07;

import java.util.Arrays;

public class Exercise7_19 {
    public static void main(String[] args){
        Buyer b =new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
    Buyer b = new Buyer();
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p ){
        if(money < p.price){
            System.out.println("잔액이 부족하여 "+p.toString()+"을 살 수 없습니다.");
            return;}
        money -= p.price;
        add(p);
    }

    void add(Product p){
        if(cart.length <= i)
           cart = Arrays.copyOf(cart,cart.length*2);
        cart[i++] = p;
    }

    void summary(){
        int sumPrice = 0;
        String products = "";
        for(int i = 0; i<cart.length; i++){
            if(cart[i]==null)break;
            sumPrice += cart[i].price;
            products += cart[i].toString()+",";
        }
        System.out.println(products);
        System.out.println("사용한 금액:"+sumPrice);
        System.out.println("남은 금액:"+money);
    }
}

class Product {
    int price;

    Product(int price){
        this.price = price;
    }
}

class Tv extends Product{
    Tv() {super(100);}

    public String toString() {return "Tv";}
}

class Computer extends Product{
    Computer() {super(200);}

    public String toString() {return "Computer";}
}

class Audio extends Product{
    Audio(){super(50);}

    public String toString(){return "Audio";}
}





