
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author guest1Day
 */
public  class BJDealer extends BJHuman{
    //カード実装
    ArrayList<Integer> cards_d = new ArrayList<Integer>();{
        for (int i = 1; i <= 13; i++) {
            cards_d.add(i);
        }
    }       
    ArrayList<Integer> cards_s = new ArrayList<Integer>();{
        for (int i = 1; i <= 13; i++) {
            cards_s.add(i);
        }
    }        
    ArrayList<Integer> cards_h = new ArrayList<Integer>();{
        for (int i = 1; i <= 13; i++) {
            cards_h.add(i);
        }
    }        
    ArrayList<Integer> cards_c =new ArrayList<Integer>();{
        for (int i = 1; i <= 13; i++) {
            cards_c.add(i);
        }
    }      
//  カード群を統合            
    ArrayList<Integer> deck = new ArrayList<Integer>();{
            deck.addAll(cards_d);
            deck.addAll(cards_s);
            deck.addAll(cards_h);
            deck.addAll(cards_c);
//  デッキをシャッフル     
            Collections.shuffle(deck);
    }
//  手札の情報
    protected ArrayList<Integer> myCards = new ArrayList<Integer>();
    
//  デッキからカードを2枚引く
    public  ArrayList<Integer> deal(){
        ArrayList<Integer> deal = new ArrayList<Integer>();
            deal.add(this.deck.get(0));
            deal.add(this.deck.get(1));
            for (int i = 0; i < 2; i++) {
            this.deck.remove(this.deck.get(0));
            }
            System.out.println(deal);
            return deal;
    }
//  デッキからカードを1枚引く    
    public  ArrayList<Integer> hit(){  
        ArrayList<Integer> hit = new ArrayList<Integer>();
            hit.add(this.deck.get(0));
            for (int i = 0; i < 1; i++) {
                this.deck.remove(0);
            }
            System.out.println(hit);
            return hit;
    }
//   カードを追加でドローするかどうかの判断
    public boolean checkSum(){
        if (open() < 17) {
            return true;
        }else{
            return false;
        }
    }
//    カードを手札に加える
    public  void setCard(ArrayList<Integer> inputCard){
        for (int i = 0; i < inputCard.size(); i++) {
            this.myCards.add(inputCard.get(i));
        }
    } 
//    手札の合計値
    public  int open(){
        int hand = 0;
            for (int i = 0; i < this.myCards.size(); i++) {
//    10以上の数字は10として計算            
                if (myCards.get(i) >= 10) {
                    myCards.set(i, 10);
                }
//    1を状況によって1か11にする判断
                if (myCards.get(i) == 1) {
                    if (hand > 11) {
                        myCards.set(i, 1);
                    }else if (hand < 12) {
                        myCards.set(i, 10+1);
                    }
                }
//    1と1だった場合12に
                if (myCards.get(0) == 1 && myCards.get(1) == 1) {
                   myCards.set(i, 10+2);
                }
                hand = hand + this.myCards.get(i); 
            }
            return hand;
    }
}
             
       
   
    
