package com.pateu;

import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFiles2 {

    public static void main(String[] args) {
        System.out.println("enter the filename u want to read");
        Scanner scanner2 = new Scanner(System.in);
        String userInputedFileName = scanner2.nextLine();

        try (Scanner scanner = new Scanner(Paths.get("./src/com/pateu/" + userInputedFileName + ".txt"))) {
            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
