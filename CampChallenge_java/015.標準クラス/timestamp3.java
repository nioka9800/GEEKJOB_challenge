import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class timestamp3 {
    public static void main(String[] args) {
        Date d1 = new Date(115,0,1,00,00,00);
        Date d2 = new Date(115,11,31,23,59,59);
        long deffe;
        
        deffe = d1.getTime() - d2.getTime();
        System.out.println(deffe);
    }
}
