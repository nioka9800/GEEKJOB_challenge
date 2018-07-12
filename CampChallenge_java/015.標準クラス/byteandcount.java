
import java.nio.charset.Charset;
import sun.security.rsa.RSACore;
import sun.text.normalizer.UTF16;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class byteandcount {
    public static void main(String[] args) {
        String name = "吉成勇平";
        System.out.println(name.getBytes().length);
        System.out.println(name.length());
    }
}
