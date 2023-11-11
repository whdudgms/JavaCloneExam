package ch10;

import java.text.DecimalFormat;

public class DecimalFormatEx2 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2  = new DecimalFormat("#.###E0");

        try{
            Number num = df.parse("1,234,567.89"); // 문자열을 숫자로
            System.out.print("1,234,567.89" + " -> ");

            double d = num.doubleValue(); // 순자를 더블로
            System.out.print(d + "->");

            System.out.println(df2.format(num)); // 숫자를 다시 형식 문자열로
        }catch (Exception e){}
    }
}
