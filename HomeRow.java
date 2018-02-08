
//import java.util.Arrays;
import java.util.Scanner;

public class HomeRow
{

    static Scanner input = new Scanner(System.in);

    public static void home()
    {

        System.out.println(
                "First you need to know the home row, the placement of your hands is seen here:");

        String[] homeDesc = {"A: Pinkie", "S: Ring Finger", "D: Middle Finger", "F: Pointer Finger",
                "J: Pointer Finger", "K: Middle Finger", "L: Ring Finger", "Semicolon: Pinkie"};

        int i;
        for (i = 0; i < homeDesc.length; i++)
        {

            System.out.print(homeDesc[i] + " ");

        }
        System.out.println();

        System.out.println("Let's practice to make sure you have the home row placement down.\n");
        System.out.println("Type each letter four times as it appers.");

        String[] homeRow = {"a", "s", "d", "f", "j", "k", "l", ";"};
        int[] hands = {1, 2, 3};

        for (i = 0; i < homeRow.length; i++)
        {

            Letter(homeRow[i]);

        }

        System.out.println("Type each word as it appears.");

        for (i = 0; i < hands.length; i++)
        {

            Words(hands[i]);

        }

    }

    public static void Letter(String letter)
    {

        String letter4 = letter + letter + letter;
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

    public static void Words(int hand)
    {

        String[] words = {"asdf", "fdsa", "jkl;", ";lkj", "fd", "fds", "jk", "jkl"};

        if (hand == 1)
        {
            int count = 0;

            for (int i = 0; i < 2; i++)
            {
                while (count < 4)
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
                while (count < 4)
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
                while (count < 4)
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

    public static boolean verifyString(String input, String match)
    {

        return input.equals(match);

    }

}
