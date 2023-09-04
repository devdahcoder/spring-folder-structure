package org.devdahcoder;

import java.util.Scanner;

public class StartProgram {

    private String userDirectory;

    public void getInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi there do you want to paste your desired path y/n: ");
        System.out.println("If you don't provide one I will be forced to use the current path you're in ;)");
        this.userDirectory = scanner.nextLine();

    }

}
