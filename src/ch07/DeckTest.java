package ch07;

import java.util.Arrays;
import java.util.Scanner;

public class DeckTest {
    public static void main(String[] args){

        // 숫자 : NO PAIR,ONE,TWO,THREE,FullHOUSE,STRAIGHT
        // 모양 : FLUSH(이 경우 중복은 없다. +=STRAIGHT or )
        System.out.println("원한는 타입을 입력하세요.");
        System.out.println("모양 : FLUSH");
        System.out.println("숫자 : NOPAIR,ONE,TWO,THREE,FullHOUSE,STRAIGHT");
        System.out.println("  검증 순서 : 모양 >> 숫자      입력 : 모양 >> 숫자  ");
        System.out.println("모양 : FLUSH일 경우 +=STRAIGHT or +=NOPAIR ");


        Scanner sc = new Scanner(System.in);
        String src = sc.next();
        sc.close();
        while(true) {
            //덱을 섞은 다음에 Card배열에 5개 저장.


            Deck d = new Deck();
            d.shuffle();
            Card c[] = new Card[5];
            for (int i = 0; i < c.length; i++) {
                c[i] = d.pick(i);
            }


            System.out.println(Deck.cardOpen(c));

            System.out.println(c[0]);
            System.out.println(c[1]);
            System.out.println(c[2]);
            System.out.println(c[3]);
            System.out.println(c[4]);
            if(Deck.cardOpen(c).equals(src))break;
        }
    }
}
class Deck{
    final int CARD_NUM = 52;
    Card cardArr[] =new Card[CARD_NUM];

    Deck() {
        int i = 0;
        for(int k = Card.KIND_MAX; k > 0; k--)
            for(int n=0; n<Card.NUM_MAX; n++)
                cardArr[i++] = new Card(k, n+1);
    }
    Card pick(int index) {	// 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
        return cardArr[index];
    }

    Card pick() {			// Deck에서 카드 하나를 선택한다.
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() { // 카드의 순서를 섞는다.
        for(int i=0; i < cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }

    static String cardOpen(Card[] c) {
        String result ="";

        // FLUSH의 경우 모든 KIND가 같은 경우
        if(c[0].kind==c[1].kind&&c[0].kind==c[2].kind&&c[0].kind==c[3].kind&&c[0].kind==c[4].kind) {
            result += "FLUSH";
        }

        // 모든 카드의 숫자를 배열로 만든다.
        int[] i = {c[0].number,c[1].number,c[2].number,c[3].number,c[4].number};
        Arrays.sort(i);  // 11114  111 33  11223 55667

        //STRAIGHT의 경우를 찾는다. 이하 동일!
        if (i[0]==i[1]-1&&i[0]==i[2]-2&&i[0]==i[3]-3&&i[0]==i[4]-4){
            return result += "STRAIGHT";
        }

        if ((i[0]==i[1]&&i[0]==i[2]&&i[0]==i[3])||(i[1]==i[2]&&i[1]==i[3]&&i[1]==i[4])){
            return result += "FOURCARD";
        }

        if (((i[0]==i[1]&&i[0]==i[2])&&(i[3]==i[4]))||((i[2]==i[3]&&i[2]==i[4])&&(i[0]==i[1]))){
            return result+= "FullHOUSE";
        }

        if ((i[0]==i[1]&&i[0]==i[2])||(i[1]==i[2]&&i[1]==i[3])||(i[2]==i[3]&&i[2]==i[4])){
            return result+= "THREE";
        }

        if ((i[0]==i[1]&&i[2]==i[3])||
                (i[0]==i[1]&&i[3]==i[4])||
                (i[1]==i[2]&&i[3]==i[4])||
                (i[2]==i[3]&&i[0]==i[1])||
                (i[3]==i[4]&&i[0]==i[1])||
                (i[3]==i[4]&&i[1]==i[2])
        ){
            return result+= "TWO";
        }

        if ((i[0]==i[1])||(i[1]==i[2])||(i[2]==i[3])||(i[3]==i[4])){
            return result+= "ONE";
        }

        return result += "NOPAIR";
    }
}


class Card{
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Card() {
        this(SPADE,1);
    }

    Card(int kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public String toString(){
        String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
        String numbers = "0123456789XJQK";

        return "kind : "+kinds[this.kind] + ", number :" +numbers.charAt(this.number);
    }
}
