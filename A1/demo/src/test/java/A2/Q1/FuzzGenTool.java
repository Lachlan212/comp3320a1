//Created by Lachlan Higgins, c3374994

package A2.Q1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

//This class generates random strings of multiple words, to undergo Fuzz Testing.
public class FuzzGenTool {

    
    public static void main(String args[]){
        for(int i=0; i<10; i++){
            System.out.println(randomTitle());
        }
        try{
            FileWriter fw = new FileWriter("input.txt");
            fw.flush();
            for(int i=0; i<10; i++){
                fw.write(randomTitle() + "\n");
            }
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    //Generates titles of 1-6 words.
    public static String randomTitle(){
        String title = "";
        Random rnd = new Random();

        for(int i=0; i<rnd.nextInt(5)+1; i++){
            title = title + randomWord() + " ";
        }
        return title;
    }

    //Generates random word by grabbing a random letter from provided alphabet.
    public static String randomWord(){

        String word = "";
        Random rnd = new Random();

        String alphabet = "QWERTYUIOPASDFGHJKLZXCVBNM,./';[]=-0987654321`~!@#$%^&*()_+|\\}{:\"?><zxcvbnmlkjhgfdsaqwertyuiop}";
        int wordLength = rnd.nextInt(20 - 1 + 1) + 1; //rnd.nextInt(max - min + 1) + min
        for(int i=0; i<wordLength; i++){
            word = word + alphabet.charAt(rnd.nextInt(95));
        }
        return word;
    }

}
