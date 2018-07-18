import java.util.Date;

public class newClass{
    public static void main(String[] args){
        Date d = new Date();
        Date dd = new Date();
        
        double a = 11.0d;
        
        System.out.println(d + "開始");
        System.out.println( a + "の平方根は" + Math.sqrt(a));
        System.out.println( a + "の立方根は" + Math.cbrt(a));
        System.out.println(dd + "終了");
    }
}