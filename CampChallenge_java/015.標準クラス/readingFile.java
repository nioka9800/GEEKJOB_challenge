import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author guest1Day
 */
public class readingFile {
    public static void main(String[] args){
        try{
            File fp = new File("c:\\新しいフォルダー\\myProfile.txt");
            FileReader fr = new FileReader(fp);
            BufferedReader br = new BufferedReader(fr);
            System.out.print(br.readLine());
            fr.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
