import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileTest {
    public static void main(String[] args) {
        String filename = "inventory.csv";
        String directory = "/home/manuelc/Documents/GitHub/java-fiap/Chapter06/06-files/src";
        String path = directory + "/" + filename;

        directoryTest(directory);
        fileTest(path);

        List<String> content = new ArrayList<>();
        content.add("Product; Quantity; Unit of Measure; Value per Unit;");
        content.add("Pear; 200; pkg; R$ 5.40");
        content.add("Strawberry; 400; box; R$ 6.50");
        content.add("Pineapple; 280; un; R$ 5.00");
        content.add("Lemon; 100; un; R$ 0.50");

        writeInventory(filename, path, content);
        readInventory(path);
    }

    private static void writeInventory(String filename, String path, List<String> content) {
        FileWriter stream;
        PrintWriter print;

        try {
            // stream is a write connection to the file
            stream = new FileWriter(path);

            // printwriter class will write the file
            print = new PrintWriter(stream);

            // print will write the content in the loop
            for(String line: content) {
                print.println(line);
            }

            print.close();
            stream.close();

            System.out.println("The file " + filename + " was saved in " + path);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readInventory(String path) { 
        try {
            // stream recieves the file
            FileReader stream = new FileReader(path);
            
            // memory buffer reader recieves the stream
            BufferedReader reader = new BufferedReader(stream);
            
            System.out.println("\n");
            
            // recieves and prints lines while they're not null
            String line = reader.readLine();
            while(line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

            reader.close();
            stream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileTest(String path) {
        File archive = new File(path);

        if(archive.exists()) {
            System.out.println("The file exists" +
            "\nCan be readed: " + archive.canRead() + 
            "\nCan be written: " + archive.canWrite() +
            "\nSize: " + archive.length() +
            "\nPath: " + archive.getPath());
        } else {
            try {
                if(archive.createNewFile())
                    System.out.println("File created");
                else
                    System.out.println("Error creating file");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void directoryTest(String directory) {
        File fileDirectory = new File(directory);

        if(fileDirectory.exists())
            System.out.println("Directory exists");

        else {

            if(fileDirectory.mkdir())
                System.out.println("Directory created");

            else
                System.out.println("Error creating directory");
        }
    }
}
