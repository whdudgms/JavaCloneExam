package ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx4 {
    public static void main(String[] args){
        String source = "A broken hand works, but not a broken asdlasjhdkjasfnkashfldshflsdjlkfldskfjldsjlfds.";
        String pattern = "broken";
        StringBuffer sb = new StringBuffer();

        Pattern p = Pattern.compile(pattern); // 패턴 저장
        Matcher m = p.matcher(source);  // 문자열 matcher
        System.out.println("source:"+source);

        int i = 0;
        while (m.find()) {  // matcher,find
            System.out.println(++i + "번째 매칭:" +m.start()+" ~ " + m.end());
            m.appendReplacement(sb,"drunken");

        }

        m.appendTail(sb);

        System.out.println("Replacementd count : " + i);
        System.out.println("result:" + sb.toString());
    }
}
