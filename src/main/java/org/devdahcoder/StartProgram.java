package org.devdahcoder;

import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class StartProgram {

    private Scanner scanner;

    public void start() {

        this.scanner = new Scanner(System.in);

        System.out.print("Hi there, do you want to specify a custom directory path? (yes - y/no - n): ");

        this.inputValidation(scanner.nextLine());

        scanner.close();

    }

    public void inputValidation(@NotNull String input) {

        String userInput = input.trim().toLowerCase();

        if (userInput.equals("yes") || userInput.equals("y")) {

            this.getUserParentDirectory();

        } else if (userInput.equals("no") || userInput.equals("n")) {

            System.out.print("We will use the current working directory: " + this.getUserCurrentDirectory());

            this.initializeSpringFolderCreator(this.getUserCurrentDirectory());

        } else {

            System.out.println("Invalid input. Please enter 'y' or 'n'.");

            this.start();

        }

    }

    public void getUserParentDirectory() {

        this.scanner = new Scanner(System.in);

        System.out.print("Please enter your desired directory path: ");

        String path = scanner.nextLine();

        System.out.print("Your custom path is " + path);

        this.initializeSpringFolderCreator(path);

    }

    public String getUserCurrentDirectory() {

        Path path = Paths.get("").toAbsolutePath();

        return path.normalize().toString();

    }

    public void initializeSpringFolderCreator(String path) {

        SpringFolderCreator springFolderCreator = new SpringFolderCreator(path);

        springFolderCreator.createFolders();

    }

}
