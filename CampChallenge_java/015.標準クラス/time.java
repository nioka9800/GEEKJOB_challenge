/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class time {
    public static void main(String[] args) {
        Date d = new Date(88,4,21,1,23,45);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        String dateString = sdf.format(d);
        System.out.println(dateString);
    }
}
