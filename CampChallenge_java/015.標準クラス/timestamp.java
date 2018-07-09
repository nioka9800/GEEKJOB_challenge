/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
import java.util.Date;
import java.util.Calendar;

public class timestamp {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        
        c.set(2016,0,1,00,00,00);
        System.out.println(c.getTime());
        
    }
    
}
