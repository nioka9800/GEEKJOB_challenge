
import java.util.Date;
import java.text.SimpleDateFormat;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class timestamp2 {
    public static void main(String[] args) {
        Date d = new Date(116,10,4,10,00,00);
        System.out.println(d.getTime());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = sdf.format(d);
        System.out.println(dateString);
    }
    
}
