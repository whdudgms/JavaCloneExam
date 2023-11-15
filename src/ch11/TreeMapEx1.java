package ch11;

import java.util.*;

public class TreeMapEx1 {
    public static void main(String[] args) {

        //배열 생성 , 트리맵생성
        String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };
        TreeMap map = new TreeMap();

        //배열 길이 만큼 해서 다 저장. 신규는 생성 기존은 value값 증가
        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])){
                Integer value = (Integer) map.get(data[i]);
                map.put(data[i], new Integer(value.intValue() + 1));
            }else{
                map.put(data[i], new Integer(1));
            }
        }

        Iterator it = map.entrySet().iterator();

        //map에 있는 값을 Iterator로 기본 출력하는 방법  ㄴㅇㄹㄴㅇㄹㄴㅇㄹㄴㅇㄹㄴㅇㄹㄴㅇㄹㄴㅇㄹ
        System.out.println("= 기본정렬 =");
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value );
        }
        System.out.println();

        //map을 ArrayList로 변환한 다으멩 Collection.sort();로 정렬
        Set set  = map.entrySet();
        List list = new ArrayList(set);

        //static void sort(List list,Comparator c)
        Collections.sort(list,new ValueComparator());

        it = list.iterator();

        System.out.println("= 값의 크기가 큰 순서로 정렬 =");
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value );
        }
    }

    static class ValueComparator implements Comparator{
        public int compare(Object o1, Object o2){
            if (o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
                Map.Entry e1 = (Map.Entry) o1;
                Map.Entry e2 = (Map.Entry) o2;

                int v1 = ((Integer)e1.getValue()).intValue();
                int v2 = ((Integer) e2.getValue()).intValue();

                return v2 - v1;
            }
            return -1;
        }
    }

    //문자와 숫자를 전달받아서 그 숫자만큼 문자를 만들어서 반환한다.
    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

            for (int i = 0; i < bar.length; i++) {
                bar[i] = ch;
            }
            return new String(bar);
        }
}

