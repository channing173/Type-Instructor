
//import java.util.Arrays;
import java.util.Scanner;

public class Alphas
{

    static Scanner input = new Scanner(System.in);

    public static void home()
    {

        System.out.println(
                "First you need to know the home row, the placement of your hands is seen here:");

        String[] homeDesc = {"A: Pinkie", "S: Ring Finger", "D: Middle Finger", "F: Pointer Finger",
                "J: Pointer Finger", "K: Middle Finger", "L: Ring Finger", "Semicolon: Pinkie"};
        
        System.out.println();
        
        desc(homeDesc);

        System.out.println("Let's practice to make sure you have the home row placement down.\n");
        System.out.println("Type each letter four times as it appers.");

        String[] homeRow = {"a", "s", "d", "f", "j", "k", "l", ";"};
        
        String[] homeWords = {"asdf", "fdsa", "jkl;", ";lkj", "fd", "fds", "jk", "jkl"};
        
        typer(homeRow, homeWords);
        
        System.out.println(
                "Now we're going to learn the row above home. The fingers that you'll be using for these letters are listed below:");

        String[] upperDesc = {"Q: Pinkie", "W: Ring Finger", "E: Middle Finger",
                "R: Pointer Finger",
                "U: Pointer Finger", "I: Middle Finger", "O: Ring Finger", "P: Pinkie"};
        
        System.out.println();
        
        desc(upperDesc);

        System.out.println(
                "Now we're going to practice this row to make sure you have the placement.\n");
        System.out.println("Type each letter four times as it appers.");

        String[] upperRow = {"q", "w", "e", "r", "u", "i", "o", "p"};
        
        String[] upperWords = {"qwer", "rewq", "uiop;", "poiu", "frde", "rew", "juki", "uio"};
        
        typer(upperRow, upperWords);

    }

    public static void Letter(String letter)
    {

        String letter4 = letter + letter + letter + letter;
        System.out.println(letter.toUpperCase() + ":");
        String in = input.nextLine();
        if (in != letter4)
        {
            while (!verifyString(in, letter4))
            {

                System.out.println(
                        "Please type the letter " + letter + " four times and press enter");
                in = input.nextLine();

            }
        }
    }

    public static void Words(int hand, String[] words)
    {

        if (hand == 1)
        {
            int count = 0;

            for (int i = 0; i < 2; i++)
            {
                while (count < 2)
                {
                    System.out.println(words[i]);
                    String in = input.nextLine();
                    if (in != words[i])
                    {

                        while (!verifyString(in, words[i]))
                        {

                            System.out.println("Please type " + words[i] + " and press enter");
                            in = input.nextLine();
                            
                        }

                    }
                    
                    count++;
                    
                }
                
                count = 0;
                
            }

        }
        else if (hand == 2)
        {
            
            int count = 0;

            for (int i = 2; i < 4; i++)
            {
                while (count < 2)
                {
                    System.out.println(words[i]);
                    String in = input.nextLine();
                    if (in != words[i])
                    {

                        while (!verifyString(in, words[i]))
                        {

                            System.out.println("Please type " + words[i] + " and press enter");
                            in = input.nextLine();
                            
                        }

                    }
                    
                    count++;
                    
                }
                
                count = 0;
                
            }

        }
        else
        {

            int count = 0;

            for (int i = 0; i < words.length; i++)
            {
                while (count < 2)
                {
                    System.out.println(words[i]);
                    String in = input.nextLine();
                    if (in != words[i])
                    {

                        while (!verifyString(in, words[i]))
                        {

                            System.out.println("Please type " + words[i] + " and press enter");
                            in = input.nextLine();
                            
                        }

                    }
                    
                    count++;
                    
                }
                
                count = 0;
                
            }
            
        }

    }
    
    public static void typer(String[] row, String[] words)
    {
        
        int[] hands = {1, 2, 3};

        for (int i = 0; i < row.length; i++)
        {

            Letter(row[i]);

        }

        System.out.println("Type group of letters as it appears.");

        for (int i = 0; i < hands.length; i++)
        {

            Words(hands[i], words);

        }
        
    }
    
    public static void desc(String[] fingers)
    {
        
        for (int i = 0; i < fingers.length; i++)
        {

            System.out.print(fingers[i] + " ");

        }
        
    }

    public static boolean verifyString(String input, String match)
    {

        return input.equals(match);

    }

}
