
/**
 *
 * @author guest1Day
 */
public abstract class BlackJack{
    public static void main(String[] args) {
        System.out.println("「GAME START」");

        BJDealer d = new BJDealer();
        BJUser u = new BJUser();
        
        System.out.println("Hand out two cards to each other.");
//      ユーザーにカードを二枚配布
        System.out.println("【User's hand】");
        u.setCard(d.deal());
        
//      21の場合、ブラックジャック　ユーザー勝利
        if (u.open() == 21) {
            System.out.println("BLACK JACK");
            System.out.println("You win");
            System.exit(0);
        }
        
//      ディーラーにカードを二枚配布  
        System.out.println("【Dealer's hand】");
        d.setCard(d.deal());
        
//      21の場会、ブラックジャック　ディーラー勝利
        if (d.open() == 21) {
            System.out.println("BLACK JACK");
            System.out.println("You lose");
            System.exit(0);
        }
/*      
        ユーザーのハンドの合計値がディーラーのハンドの合計値より低い
        or 16より小さい場合にはそれを上回るまでループ 
*/      
        u.open();{
            if (d.open() >= u.open() || u.open() < 16) {
                System.out.println("「User turn.」");
                for (int i = 0; u.open() < 16; i++) {
                    u.setCard(d.hit());
                }
            }
//      21以上の場合、ユーザーバスト　ディーラー勝利で終了
            if (u.open() > 21) {
                System.out.println("User busted.");
                System.out.println("You lose");
                System.exit(0);
            }
        }
/*
        ディーラーはハンドの合計値が17より小さい場合は強制的に17以上になるまでヒット
        17以上になった場合ストップ
*/      
        d.open();{
            if (d.checkSum()) {
                System.out.println("「Dealer's turn.」");
                for (int i = 0; d.open() < 17; i++) {
                    d.setCard(d.hit());
                }    
//      21以上の場合、ディーラーバスト　ユーザー勝利で終了                
                    if (d.open() > 21) {
                    System.out.println("Dealer busted.");
                    System.out.println("You win");
                    System.exit(0);
                    }   
            }
        }
/*
        ユーザー＞ディーラー・・・ユーザー勝利
        ディーラー＞ユーザー・・・ディーラー勝利
        ユーザー＝ディーラー・・・ドロー
*/
        if (u.open() > d.open()) {
            System.out.println("You win");
        }else if (d.open() > u.open()) {
            System.out.println("You lose");
        }else{
            System.out.println("Draw");
        }
    }
}    