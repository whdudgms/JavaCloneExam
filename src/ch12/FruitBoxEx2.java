package ch12;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();

        fruitBox.add(new Fruit()); // 여기서
        fruitBox.add(new Apple()); //
        fruitBox.add(new Grape()); //
        appleBox.add(new Apple()); //
        //appleBox.add(new Grape());
        grapeBox.add(new Grape());

        System.out.println("fruitBox-"+fruitBox); //
        System.out.println("appleBox-"+appleBox);
        System.out.println("grapeBox-"+grapeBox);

    }
}


class FruitBox<T extends Fruit & Eatable> extends Box<T> {
    // 이렇게 제한된 제네릭 타입을 사용하면 값으로 Fruit   Eatable의 공동 자손만 올 수 있다.
}
