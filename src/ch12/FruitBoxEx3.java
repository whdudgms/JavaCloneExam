package ch12;


class Juice{
    String name;
    Juice(String name) {
        this.name = name;
    }
    public String toString() {return name;}
}

class Juicer{
    static Juice makeJuice(FruitBox<? extends Fruit> box){
        String tmp = "";

        for (Fruit f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}
public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}


