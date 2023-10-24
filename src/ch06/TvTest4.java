package ch06;

class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;
        }

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        }

        // 객체배열을 생성해서 for문을 활용해서 각 배열을 초기화함.
        // 다른 초기화 하는 법음 참조변수 선언시에 { }를 활용해서 초기화함.
    }
}
