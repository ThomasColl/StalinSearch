package com.stalin;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       StalinSearch stalinSearch = new StalinSearch();

        ArrayList<Integer> randomList1 = randomNumberGenerator(20);

        System.out.println("The list of random comrade numbers is: ");
        for(int value : randomList1) {
            System.out.println(value);
        }

        System.out.println("The list according to comrade Stalin:");
        ArrayList<Integer> sortedList1 = stalinSearch.stalinFirst(randomList1);

        for(int value : sortedList1) {
            System.out.println(value);
        }

        System.out.println("The list according to the Party:" );
        ArrayList<Integer> sortedList2 = stalinSearch.partyFirst(randomList1);

        for(int value : sortedList2) {
            System.out.println(value);
        }

        System.out.println("Glory to the party and Comrade Stalin!");

    }

    private static ArrayList<Integer> randomNumberGenerator(int numberOfRandoms) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < numberOfRandoms; i++) {
            list.add((int)Math.floor(Math.random()*(999-1+1)+1));
        }

        return list;
    }
}
