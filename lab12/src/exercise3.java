import java.io.*;
import java.util.Scanner;

public class exercise3{
    static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt"))
        {
            Scanner s = new Scanner(in);
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a/b);
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}