package A2.Q1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FuzzGenTool {

    
    public static void main(String args[]){
        for(int i=0; i<10; i++){
            System.out.println(randomWord());
        }
        try{
            FileWriter fw = new FileWriter("input.txt");
            fw.flush();
            for(int i=0; i<10; i++){
                fw.write(randomWord() + "\n");
            }
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static String randomWord(){

        String word = "";
        Random rnd = new Random();

        String alphabet = "QWERTYUIOPASDFGHJKLZXCVBNM,./';[]=-0987654321`~!@#$%^&*()_+|\\}{:\"?><zxcvbnmlkjhgfdsaqwertyuiop}      ";
        int wordLength = rnd.nextInt(35 - 1 + 1) + 1; //rnd.nextInt(max - min + 1) + min
        for(int i=0; i<wordLength; i++){
            word = word + alphabet.charAt(rnd.nextInt(101));
        }
        return word;
    }

}
