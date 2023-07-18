package com.queue.resources;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerImproved {

    private static final Scanner nextScanner = new Scanner(System.in);

    public static int nextInt(String displayString) {
        int value;

        while (true) {
            try {
                System.out.print(displayString);
                value = nextScanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                nextScanner.nextLine();
                continue;
            }
        }

        return value;
    }

}