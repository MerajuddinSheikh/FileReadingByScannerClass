package fileread;

import java.io.File;
import java.util.Scanner;

public class byscanner {

    public static void main(String[] args) throws Exception {

//Reading the file without using Scanner class.

        String filepath = "f:\\Users\\Merajuddin Sheikh\\Documents\\record.txt";

        File record = new File(filepath);

        Scanner scan = new Scanner(record);

        while (scan.hasNextLine()) {


            System.out.println(scan.nextLine());
        }


    }

}
