package ch11;

import java.util.HashSet;
import java.util.Set;


// set 순서도 없고 중복도 없다 근데 출력했을 때 1이 2개 보이는 이유는 무러까 그건
// 하나는 String 1 Integer 1 인 것이다 두 객체 모드 toString 1반환 으로 오버라이딩 되어서 이렇게 출력되는거다.
public class HashSetEx1 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4",4};
        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }

        System.out.println(set);
    }
}
