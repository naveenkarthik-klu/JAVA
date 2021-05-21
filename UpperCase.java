import java.util.Scanner;

import java.io.*;
public class UpperCase
{
    public static void main(String[] args)throws IOException
    {
        String filename;
        String message;
        String filename2;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename: ");

        filename = keyboard.nextLine();
        FileWriter fwriter = new FileWriter(filename);

        PrintWriter outputFile = new PrintWriter(fwriter);
        System.out.println("Enter a message: ");

        message = keyboard.nextLine();
        outputFile.println(message);

        outputFile.close();
        System.out.println("Enter the name of the second file: ");

        filename2 = keyboard.nextLine();

        FileReader freader = new FileReader(filename2);

        BufferedReader inputFile = new BufferedReader(freader);

        String str;
        str = inputFile.readLine();
        while (str != null)

        {

            System.out.println(str);

            String upper = message.toUpperCase();

            str = inputFile.readLine(upper);

        }
        inputFile.close();

    }

}
