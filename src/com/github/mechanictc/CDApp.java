package com.github.mechanictc;

import java.text.NumberFormat;
import java.util.LinkedList;

//@author Nathan Kwok
public class CDApp {

    // Inner CD class
    static class CD {
        private String title, artist;
        private double cost;
        private int tracks;

        public CD(String name, String singer, double price, int numTracks) {
            title = name;
            artist = singer;
            cost = price;
            tracks = numTracks;
        }

        public String toString() {
            NumberFormat fmt = NumberFormat.getCurrencyInstance();
            return fmt.format(cost) + "\t" + tracks + "\t" + title + "\t" + artist;
        }
    }

    public static void main(String[] args) {
        LinkedList<CD> collection = new LinkedList<>();

        // Add CDs to the collection
        collection.add(new CD("Hybrid Theory", "Linkin Park", 12.99, 12));
        collection.add(new CD("Back in Black", "AC/DC", 10.99, 10));
        collection.add(new CD("Thriller", "Michael Jackson", 15.99, 9));
        collection.add(new CD("Nevermind", "Nirvana", 11.49, 12));

        // Print collection
        System.out.println("CD Collection:");
        for (CD cd : collection) {
            System.out.println(cd);
        }
    }
}
