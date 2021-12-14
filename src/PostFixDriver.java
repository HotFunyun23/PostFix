
import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;


public class PostFixDriver {
    public static void main(String[]args) throws IOException {

        //declares scanners/files names
        Scanner reader = new Scanner(System.in);
        Scanner scanFile;
        PostFix p = new PostFix();
        String inputFile;
        File file = new File("log.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        //gets the input file
        System.out.println("Name of .txt file? : ");
        inputFile = reader.nextLine();
        scanFile = new Scanner(new File(inputFile));

        //loop that reads and sends to new file
        while(scanFile.hasNextLine()){
            String userInput = scanFile.nextLine();
            String fin;
            p.setInput(userInput);
            fin="Input: "+userInput+"   | Result: "+p.calculate()+"\n";
            writer.write(fin);
        }
        writer.flush();
        writer.close();
        System.out.println("Done");

    }

}