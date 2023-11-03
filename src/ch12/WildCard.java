package ch12;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
        import java.util.List;

class Animal {
    public void speak() {
        System.out.println("동물이 소리를 내고 있습니다.");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("개가 짖고 있습니다.");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("고양이가 야옹하고 있습니다.");
    }
}

public class WildCard {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());

        List<Cat> animals1 = new ArrayList<>();
        List<Dog> animals2 = new ArrayList<>();

        animals1.add(new Cat());
        animals1.add(new Cat());
        animals1.add(new Cat());

        animals2.add(new Dog());
        animals2.add(new Dog());
        animals2.add(new Dog());


        // 와일드 카드는 참조변수에 매개변수에 사용한다.


        // 와일드카드를 사용한 메서드
        printAnimals(animals);

        printAnimals(animals1);

        printAnimals(animals2);


    }

    // 와일드카드를 사용하여 다양한 동물을 출력하는 메서드
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
