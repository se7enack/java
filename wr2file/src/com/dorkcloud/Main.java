package com.dorkcloud;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

// writes to a file
public class Main {
    public static void main(String[] args) throws IOException {
        String file = "output.txt";
        PrintStream writer = new PrintStream( new File(file));
        writer.println("Stephen Burke is a goof!");
        writer.close();

    }
}

