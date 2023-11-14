package ch11;

//왜 이렇게 됐을까 [David : 10, abc, David : 10] 비교기준 equals hashcode로 비교한 결과가 같으면 중복 아니면 중복 x
//person객체의 기본 기준은 주소이니까 이렇게 같은 데이터를 가진 객체가 중복저장이 가능한 것이다.

import java.util.HashSet;


public class HashSetEx3 {
    public static void main(String[] args){
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + " : " + age;
    }
}
