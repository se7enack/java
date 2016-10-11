package com.dorkcloud;

public class Main {

    public static void main(String[] args) {
        // Foolish program - Stephen Burke 10/10/2016
        int age = 44;
        String lastName = "Burke";
        String firstName = "Stephen";
        System.out.println(age);
        int x = 1;
        while (x <= age) {
            if (x < age) {
                System.out.println("\nHello " + firstName + " " + lastName + ". You were once " + x + " years old.");
                x++;
                if (x == age) {
                    System.out.println("\nYou are now " + age);
                }

            }
        }
    }
}
