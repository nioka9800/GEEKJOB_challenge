
import jdk.nashorn.internal.codegen.CompilerConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class jobchange extends Human{
    public static void main(String[] args) {
        Human human = new Human();
        
        human.setHuman("ああああ", 50);
        
        System.out.println(human.name);
        System.out.println(human.level);
        
        jobchange sage = new jobchange();
        System.out.println(sage.name);
        System.out.println(sage.level);
    }
}
