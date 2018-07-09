
/**
 *
 * @author guest1Day
 */
public abstract class BlackJack{
    public static void main(String[] args) {
        System.out.println("ゲームスタート");

        BJDealer d = new BJDealer();
        BJUser u = new BJUser();
        
        System.out.println("カードをディール");
//      ユーザーにカードを二枚配布
        System.out.println("【ユーザーのハンド】");
        u.setCard(d.deal());
        
//      21の場合、ブラックジャック　ユーザー勝利
        if (u.open() == 21) {
            System.out.println("ブラックジャック");
            System.out.println("ユーザーの勝ち");
            System.exit(0);
        }
        
//      ディーラーにカードを二枚配布  
        System.out.println("【ディーラーのハンド】");
        d.setCard(d.deal());
        
//      21の場会、ブラックジャック　ディーラー勝利
        if (d.open() == 21) {
            System.out.println("ブラックジャック");
            System.out.println("ユーザーの負け");
            System.exit(0);
        }
/*      
        ユーザーのハンドの合計値がディーラーのハンドの合計値より低い
        or 17より小さい場合にはそれを上回るまでループ 
*/      
        u.open();{
            if (d.open() > u.open() || u.checkSum()) {
                System.out.println("「ユーザーのターン」");
                    for (int i = 0; d.open() >= u.open() || u.open() < 18; i++) {
                    u.setCard(d.hit());
                    }
            }
//      21以上の場合、ユーザーバスト　ディーラー勝利で終了
            if (u.open() > 21) {
                System.out.println("ユーザーバスト");
                System.out.println("ユーザーの負け");
                System.exit(0);
            }
        }
/*
        ディーラーはハンドの合計値が17より小さい場合は強制的に17以上になるまでヒット
        17以上になった場合ストップ
*/      
        d.open();{
            if (d.checkSum()) {
                System.out.println("「ディーラーのターン」");
                for (int i = 0; d.open() < 17; i++) {
                    d.setCard(d.hit());
                }    
//      21以上の場合、ディーラーバスト　ユーザー勝利で終了                
                    if (d.open() > 21) {
                    System.out.println("ディーラーバスト");
                    System.out.println("ユーザーの勝利");
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
            System.out.println("ユーザーの勝利");
        }else if (d.open() > u.open()) {
            System.out.println("ユーザーの負け");
        }else{
            System.out.println("ドロー");
        }
    }
}    