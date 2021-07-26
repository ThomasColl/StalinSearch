package com.stalin;

import java.util.ArrayList;
import java.util.Collections;

public class StalinSearch {

    public StalinSearch() {
    }

    public ArrayList<Integer> stalinFirst(ArrayList<Integer> partyList) {
        ArrayList<Integer> newList = new ArrayList<>();
        int firstComrade = partyList.get(0);

        for(int comrade : partyList) {
            if(comrade >= firstComrade) {
                newList.add(comrade);
                firstComrade = comrade;
            }
        }
        return newList;

    }

    public ArrayList<Integer> partyFirst(ArrayList<Integer> partyList) {
        Collections.reverse(partyList);
        ArrayList<Integer> newList = new ArrayList<>();
        int lastComrade = partyList.get(0);

        for(int comrade : partyList) {
            if(comrade <= lastComrade) {
                newList.add(comrade);
                lastComrade = comrade;
            }
        }
        return newList;

    }

}
