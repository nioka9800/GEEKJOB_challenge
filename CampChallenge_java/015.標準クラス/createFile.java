import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
/**
 *
 * @author guest1Day
 */
public class createFile {
    public static void main(String[] args){
        File file = new File("c:\\新しいフォルダー\\myProfile.txt");
        try{
            if(file.createNewFile()){
                System.out.println("成功");
            }else{
                System.out.println("失敗");
            }
        }catch(IOException e){
            System.out.println("例外が起きました");
            System.out.println("e");
        }
        try{
            FileWriter fw = new FileWriter(file,true);
            fw.write("name:吉成勇平　age:23　height:181");
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

