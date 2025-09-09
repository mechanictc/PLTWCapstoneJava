package com.github.mechanictc;

//*******************************************************************
// MagazineRack.java Author: Lewis/Loftus/Cocking (modified)
//
// Driver to exercise the MagazineList collection.
//*******************************************************************

//@author Nathan Kwok
public class MagazineRack {
    public static void main(String[] args) {
        MagazineList rack = new MagazineList();

        // Insert in alphabetical order
        rack.insert(new Magazine("Time"));
        rack.insert(new Magazine("Wired"));
        rack.insert(new Magazine("Communications of the ACM"));
        rack.insert(new Magazine("House and Garden"));
        rack.insert(new Magazine("GQ"));

        System.out.println("After inserting alphabetically:");
        System.out.println(rack);

        // Delete some magazines
        rack.delete(new Magazine("Time"));
        rack.delete(new Magazine("GQ"));

        System.out.println("After deletions:");
        System.out.println(rack);
    }
}
