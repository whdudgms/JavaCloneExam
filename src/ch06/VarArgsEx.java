package ch06;

//내가 이해가 안 된 부분이 4번째와 5번째 출력이다 근데 메서드를 구현한 부분을 봤을 때 구분자는 배열이 출력될 때만 같이 출력된다는 점을 기억하면 이해하기 쉬울것 같다
// 즉 구분자로 "ㅁㄴㅇㅁㄴㅇㅁㄴ" 이렇게 주고 new String[0] 이렇게 배열을 줘 뻐리면 아무것도 나오지 않는다.
public class VarArgsEx {
    public static void main(String[] args){
        String[] strArr = {"100","200","300"};

        System.out.println(concatenate("","100","200","300"));
        System.out.println(concatenate("-",strArr));
        System.out.println(concatenate(",",new String[]{"1","2","3"}));
        System.out.println("["+concatenate(",",new String[0])+"]"); // 배열 + 구분자 인데 배열이 0이면 구분자도 같이 출력될 일이 없다.
        System.out.println("["+concatenate(",")+"]");

    }

    static String concatenate(String delim, String... args){
        String result = "";

        for(String str : args){
            result +=str + delim;
        }
        return result;
    }

}
