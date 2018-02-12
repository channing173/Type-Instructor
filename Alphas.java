
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

        System.out.println("Let's practice to make sure you have the home row placement down.\n");
        System.out.println("Type each letter four times as it appers.");

        String[] upperRow = {"q", "w", "e", "r", "u", "i", "o", "p"};

        String[] upperWords = {"qwer", "rewq", "uiop;", "poiu", "frde", "rew", "juki", "uio"};

        typer(upperRow, upperWords);

        System.out.println(
                "Next, we will learn the letters in the middle of the keyboard, examine the description of which fingers touse below:");
        String[] innerDesc = {"G: Left Pointer", "T: Left Pointer", "B: Left Pointer",
                "H: Right Pointer", "Y: Right Pointer", "N: Right Pointer"};

        System.out.println();

        desc(innerDesc);

        System.out.println("Let's practice to make sure you have the home row placement down.\n");
        System.out.println("Type each letter four times as it appers.");

        String[] innerRow = {"t", "g", "b", "y", "h", "n"};

        String[] innerWords = {"ftgb", "jyhn", "jnhy", "fbgt", "tgb", "yhn", "nhy", "bgt"};
        
        typer(innerRow, innerWords);
        
        System.out.println(
                "Now to learn the row below home, take a look at the description of which fingers touse below:");
        String[] lowerDesc = {"Z: Pinkie", "X: Ring Finger", "C: Middle Finger",
                "V: Pointer Finger",
                "M: Pointer Finger", "Comma: Middle Finger", "Period: Ring Finger", "Forward Slash: Pinkie"};

        System.out.println();

        desc(lowerDesc);

        System.out.println("Let's practice to make sure you have the home row placement down.\n");
        System.out.println("Type each letter four times as it appers.");

        String[] lowerRow = {"z", "x", "c", "v", "m", ",", ".", "/"};

        String[] lowerWords = {"zxcv", "vcxz", "m,./", "/.,m", "fvdc", "jmk,", "vcx", "m,."};
        
        typer(lowerRow, lowerWords);
        
        System.out.println(
                "Now we're going to look at the last couple of symbols, take a look at the description of which fingers touse below:");
        String[] symbolDesc = {"Left Bracket: Right Pinkie", "Right Bracket: Right Pinkie", "Apostrophe: Right Pinkie"};

        System.out.println();

        desc(symbolDesc);

        System.out.println("Let's practice to make sure you have the home row placement down.\n");
        System.out.println("Type each letter four times as it appers.");

        String[] symbolRow = {"[", "]", "'"};

        String[] symbolWords = {"[]'", "'][", "[]", "]["};
        
        typer(symbolRow, symbolWords);

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
