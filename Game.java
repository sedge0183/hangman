import java.util.*;

public class Game
{
    static String word = "te";
    static String[] progress;
    static String guessed = "";

    public static boolean checkProgress()
    {
        for(int i = 0; i < progress.length; i++)
            if(progress[i] == null)
                return true;
        
        return false;
    }

    public static boolean charInString(char character, String sequence)
    {
        for(int i = 0; i < sequence.length(); i++)
            if(character == sequence.charAt(i))
                return true;
        
        return false;
    }

    public static String arrayToString(String[] ray)
    {
        String output = "[";
        for(int i = 0; i < (ray.length - 1); i ++)
            output += ray[i] + ", ";
        output += ray[ray.length - 1] + "]";
        return output;
    }


    public static void main(String[] args)
    {
        progress = new String[word.length()];
        Scanner in = new Scanner(System.in);
        
    }
}
