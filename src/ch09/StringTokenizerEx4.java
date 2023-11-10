package ch09;

import java.util.StringTokenizer;

public class StringTokenizerEx4 {
    public static void main(String[] args){
        String input = "구천팔백육십일만천삼백일";

        System.out.println(input);
        System.out.println(hangulToNum(input));
    }


    // 한글을 숫자로 바꾸는 메서드
    public static long hangulToNum(String input){
        long result = 0;    // 최종 변환결과를 저장하기 위한 변수
        long tmpResult = 0; // // 십백천 단위의 값을 저장하기 위한 임시변수
        long num =0;

        final String NUMBER ="영일이삼사오육칠팔구";
        final String UNIT = "십백천만억조";
        final long[] UNIT_NUM ={10,100,1000,10000,(long)1e8,(long)1e12};

        StringTokenizer st = new StringTokenizer(input,UNIT,true);
        //"구천팔백육십일만천삼백일";

        while(st.hasMoreTokens()){
            String token = st.nextToken();

            int check = NUMBER.indexOf(token);

            if(check == -1){ // 십백천만억조
                if("만억조".indexOf(token)==-1){ // 작은단위 십백천
                    tmpResult += (num!=0 ? num:1) * UNIT_NUM[UNIT.indexOf(token)];
                }else{  //큰단위    만억조
                    tmpResult += num;
                    result += (tmpResult!=0? tmpResult:1) * UNIT_NUM[UNIT.indexOf(token)];
                    tmpResult = 0;
                }
                num = 0;
            }else{  // 단순 숫자 ex 영  일 이 삼 사 오 육 칠 팔구 영 > 0 구 => 9
                num = check;
            }
        }

        return result + tmpResult +num;
    }
}
