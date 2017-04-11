package kr.ac.jejunu;

import java.util.Scanner;

/**
 * Created by blue on 2017-03-23.
 */
public class Input {
    private Scanner scanner;
    private int anInt;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public int scaninteger(){
        anInt = scanner.nextInt();

        return anInt;
    }
}
