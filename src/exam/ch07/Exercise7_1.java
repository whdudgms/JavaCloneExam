package exam.ch07;
/*
// 1번문제 배열 초기화와 2번문제도 같이 풀었다.
class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards =  new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for(int i = 0; i < CARD_NUM; i++){
            int x = i +1;
            if(x ==1||x==3||x==8){cards[i] =new SutdaCard(x%10,true);
            continue;}
            cards[i] = new SutdaCard(x%10==0?10:x%10,false);

        }
    }

    void suffle(){
        int index = 0;
        SutdaCard tmp;
        for(int i = 0; i < cards.length; i++){
            index = (int)Math.random()*20 +1;
            tmp = cards[i];
            cards[i] =cards[index];
            cards[index] = tmp;
        }
    }
    SutdaCard pick(int index){
        return cards[index];
    }

    SutdaCard pick(){
        return cards[(int)Math.random()*20 +1];
    }

}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num + (isKwang ? "K": "");
    }
}

public class Exercise7_1 {
    public static void main(String[] agrs){
        SutdaDeck deck = new SutdaDeck();

        for(int i = 0; i < deck.cards.length; i++){
            System.out.print(deck.cards[i]+",");
        }
    }
}
*/