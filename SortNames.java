import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * A program that reads names from a text file, sorts them, then writes them to another text file.
 *
 * <p>Purdue University -- CS18000 -- Spring 2021</p>
 *
 * @author Mason Knight
 * @version January 19, 2021
 */
public class SortNames {

    

    public static ArrayList<String> readFile(String filename) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        // TODO
        return list;
    }

    public static void writeFile(String filename, ArrayList<String> names) throws FileNotFoundException {
        //TODO
    }

    public static void main(String[] args) {
        ArrayList<String> names;
        System.out.println("Enter filename with unsorted names");
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        try {
            names = readFile(filename);
            Collections.sort(names);
            writeFile("sorted_names.txt", names);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return;
        }
        System.out.println("Sorted names written to sorted_names.txt");
    }
}
