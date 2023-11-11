package ch10;

import java.text.ChoiceFormat;

public class ChoiceFormatEx1 {
    public static void main(String[] args) {
        // 패턴과 해당하는 값들을 정의
        double[] limits = {1, 2, 3, 4, 5};
        String[] formats = {"A", "B", "C", "D", "E"};

        // ChoiceFormat 생성
        ChoiceFormat choiceFormat = new ChoiceFormat(limits, formats);

        // 특정 값에 대한 형식 확인
        System.out.println("3.5 is in range: " + choiceFormat.format(3.5));
        System.out.println("1.5 is in range: " + choiceFormat.format(1.5));
        System.out.println("5.5 is in range: " + choiceFormat.format(5.5));
    }
}
