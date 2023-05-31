//Created by Lachlan Higgins, c3374994

package A2.Q1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

//This class generates random strings of multiple words, to undergo Fuzz Testing.
public class FuzzGenTool {
 
    public static void main(String args[]){

        for(int i=0; i<10; i++){
            System.out.println(randomTitle(alphabetSelect(8)));
        }
        
    }
    
    public static String alphabetSelect(int i){
        String alphabet = "";
        switch(i){
            case 1: //alphabetical characters
                alphabet = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
                break;
            case 2: //numerical characters
                alphabet = "1234567890";
                break;
            case 3: //special characters
                alphabet = "!@#$%^&*()_+|}{\":?><,./;'[]\\-='}~`";
                break;
            case 4: //alphanumerical
                alphabet = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
                break;
            case 5: //numerical and special characters
                alphabet = "1234567890!@#$%^&*()_+|}{\":?><,./;'[]\\-='}~`";
                break;
            case 6: //alphabetical and special characters
                alphabet = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM!@#$%^&*()_+|}{\":?><,./;'[]\\-='}~`";
                break;
            case 7:
                alphabet = "QWERTYUIOPASDFGHJKLZXCVBNM,./';[]=-0987654321`~!@#$%^&*()_+|\\}{:\"?><zxcvbnmlkjhgfdsaqwertyuiop}";
                break;
            case 8:
                break;
        }

        return alphabet;
    }

    public void inputFileGen(int k){

        String alphabet = alphabetSelect(k);

        try{
            FileWriter fw = new FileWriter("input.txt");
            fw.flush();
            for(int i=0; i<10; i++){
                fw.write(randomTitle(alphabet) + "\n");
            }
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    //Generates titles of 1-6 words.
    public static String randomTitle(String alphabet){
        String title = "";
        Random rnd = new Random();
        if(alphabet == ""){
            return "";
        }
        for(int i=0; i<rnd.nextInt(5)+1; i++){
            title = title + randomWord(alphabet) + " ";
        }
        return title;
    }

    //Generates random word by grabbing a random letter from provided alphabet.
    public static String randomWord(String alphabet){

        String word = "";
        Random rnd = new Random();
        int wordLength = rnd.nextInt(35-1 - 1 + 1) + 1; //rnd.nextInt(max - min + 1) + min
        for(int i=0; i<wordLength; i++){
            word = word + alphabet.charAt(rnd.nextInt(alphabet.length()-1));
        }
        return word;
    }

}
