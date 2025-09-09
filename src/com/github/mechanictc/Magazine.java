package com.github.mechanictc;

//********************************************************************
// Magazine.java Author: Lewis/Loftus/Cocking (modified)
//
// Represents a single magazine.
//********************************************************************

//@author Nathan Kwok
public class Magazine implements Comparable<Magazine> {
    private String title;

    //-----------------------------------------------------------------
    // Sets up the new magazine with its title.
    //-----------------------------------------------------------------
    public Magazine(String newTitle) {
        title = newTitle;
    }

    //-----------------------------------------------------------------
    // Returns this magazine as a string.
    //-----------------------------------------------------------------
    public String toString() {
        return title;
    }

    //-----------------------------------------------------------------
    // Defines natural ordering based on alphabetical title.
    //-----------------------------------------------------------------
    @Override
    public int compareTo(Magazine other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    //-----------------------------------------------------------------
    // Two magazines are equal if their titles match.
    //-----------------------------------------------------------------
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Magazine) {
            return this.title.equalsIgnoreCase(((Magazine) obj).title);
        }
        return false;
    }
}
