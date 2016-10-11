package com.dorkcloud;

public class Main {

    public static void main(String[] args) {
        int myAge = 44;
        int afterFirstTwo = (myAge - 2);
        double dogYearsUnder = (myAge * 10.5);
        double dogYearsOver = ((afterFirstTwo * 4) + (2 * 10.5));
        if (myAge > 2) {
            double dogYears = dogYearsOver;
            System.out.println("If you are " + myAge + " years old, you would be " + dogYears + " in dog years.");
        } else {
            double dogYears = dogYearsUnder;
            System.out.println("If you are only " + myAge + " years old, you would be " + dogYears + " in dog years. You are just a puppy!");
        }
    }
}