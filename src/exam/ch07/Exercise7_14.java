package exam.ch07;

class SutdaCard {
    private int num;
    private boolean isKwang;

    public SutdaCard() {
    }

    public SutdaCard(int num,boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num + (isKwang ? "K": "");
    }
}
public class Exercise7_14 {
    public static void main(String[] agrs){
        SutdaCard card= new SutdaCard(1,true);
    }
}
