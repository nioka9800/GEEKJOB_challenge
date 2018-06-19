
import com.sun.javafx.scene.text.HitInfo;
import java.sql.DriverManager;
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
public class class1 {
    public String name = "";
    public int eng = 0;
    public void setclass1(String a,int b){
        this.name = a;
        this.eng = b;
        
        
    } 
    public static void main(String[] args) {
        class1 car = new class1(); 
        car.name = "integra";
        car.eng = 1800;
        System.out.println(car.name);
        System.out.println(car.eng);
        
    }
}
