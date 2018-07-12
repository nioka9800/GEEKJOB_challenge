/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class replacewords {
    public static void main(String[] args){
        String words = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        words = words.replace("U","う");
        words = words.replace("I","い");
        System.out.println(words);
    }
}
