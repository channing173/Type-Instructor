import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Alphas
{

    static Scanner input;

    public static void home(InputStream inputStream) throws FileNotFoundException
    {
        
        input = new Scanner(inputStream);

        ArrayList<String> doc = new ArrayList<String>();
        Scanner s = new Scanner(new File("alphaPrompt.txt"));
        while (s.hasNext())
        {

            doc.add(s.nextLine());

        }
        s.close();

        for (int i = 1; i < doc.size(); i += 11)
        {

            System.out.println(doc.get(i) + "\n");
            String desc[] = doc.get(i + 1).split(",");

            desc(desc);

            for (int j = i + 3; j < i + 9; j += 11)
            {

                System.out.println(doc.get(j) + "\n" + doc.get(j + 1) + "\n");

                String[] row;
                String[] words;

                if (j + 3 != 40)
                {
                    row = doc.get(j + 3).split(",");
                    words = doc.get(j + 5).split(",");
                }
                else
                {

                    row = doc.get(j + 3).split(" ");
                    words = doc.get(j + 5).split(" ");

                }

                typer(row, words);

            }

        }

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
        System.out.println();
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
