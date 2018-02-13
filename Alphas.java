
//import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Alphas
{

    static Scanner input = new Scanner(System.in);

    public static void home() throws FileNotFoundException
    {

        ArrayList<String> doc = new ArrayList<String>();
        Scanner s = new Scanner(new File("alphaPrompt.txt"));
        while (s.hasNext())
        {

            doc.add(s.nextLine());

        }
        s.close();

        //Home Row
        System.out.println(doc.get(1) + "\n");

        String[] homeDesc = doc.get(2).split(",");

        desc(homeDesc);

        System.out.println(doc.get(4) + "\n" + doc.get(5) + "\n");

        String[] homeRow = doc.get(7).split(",");

        String[] homeWords = doc.get(10).split(",");

        typer(homeRow, homeWords);

        //Upper Row
        System.out.println(doc.get(12) + "\n");
        String[] upperDesc = doc.get(13).split(",");

        desc(upperDesc);

        System.out.println(doc.get(15) + "\n" + doc.get(16) + "\n");

        String[] upperRow = doc.get(18).split(",");

        String[] upperWords = doc.get(20).split(",");

        typer(upperRow, upperWords);

        //Inner Row
        System.out.println(doc.get(23) + "\n");
        String[] innerDesc = doc.get(24).split(",");

        desc(innerDesc);

        System.out.println(doc.get(26) + "\n" + doc.get(27) + "\n");

        String[] innerRow = doc.get(29).split(",");

        String[] innerWords = doc.get(31).split(",");

        typer(innerRow, innerWords);

        //Lower Row
        System.out.println(doc.get(34) + "\n");
        String[] lowerDesc = doc.get(35).split(",");

        desc(lowerDesc);

        System.out.println(doc.get(37) + "\n" + doc.get(38) + "\n");

        String[] lowerRow = doc.get(40).split(" ");

        String[] lowerWords = doc.get(42).split(" ");

        typer(lowerRow, lowerWords);

        //Extra Symbols
        System.out.println(doc.get(45) + "\n");
        String[] symbolDesc = doc.get(46).split(",");

        desc(symbolDesc);

        System.out.println(doc.get(48) + "\n" + doc.get(49) + "\n");

        String[] symbolRow = doc.get(51).split(",");

        String[] symbolWords = doc.get(53).split(",");

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
