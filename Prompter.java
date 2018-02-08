import java.io.InputStream;
import java.util.Scanner;

public class Prompter
{
    
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to INSTRUCTOR, press a letter to continue...");

        String keypress = input.next();

        while (!verifyAny(keypress))
        {
            System.out.println("You need to press a letter");
            keypress = input.next();
        }
        
        System.out.println("Alright, let's get started!\n");
        
        input.close();
        
        HomeRow.home();

    }

    public static boolean verifyAny(String letter)
    {

        return letter.matches("[a-zA-z]+");

    }

}
