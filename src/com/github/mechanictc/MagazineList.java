package com.github.mechanictc;

//*******************************************************************
// MagazineList.java Author: Lewis/Loftus/Cocking (modified)
//
// Represents a collection of magazines.
//*******************************************************************

//@author Nathan Kwok
public class MagazineList {
    private ListNode list;

    //-----------------------------------------------------------------
    // Sets up an empty list of magazines.
    //-----------------------------------------------------------------
    public MagazineList() {
        list = null;
    }

    //-----------------------------------------------------------------
    // Creates a new node and adds it to the END of the list.
    //-----------------------------------------------------------------
    public void add(Magazine mag) {
        ListNode node = new ListNode(mag, null);
        if (list == null) {
            list = node;
        } else {
            ListNode current = list;
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext(node);
        }
    }

    //-----------------------------------------------------------------
    // Inserts magazine alphabetically (using compareTo).
    //-----------------------------------------------------------------
    public void insert(Magazine mag) {
        ListNode node = new ListNode(mag, null);

        // Case: empty list OR new mag comes before the first
        if (list == null || mag.compareTo((Magazine) list.getValue()) < 0) {
            node.setNext(list);
            list = node;
        } else {
            ListNode current = list;
            while (current.getNext() != null &&
                   mag.compareTo((Magazine) current.getNext().getValue()) > 0) {
                current = current.getNext();
            }
            node.setNext(current.getNext());
            current.setNext(node);
        }
    }

    //-----------------------------------------------------------------
    // Deletes a magazine if found.
    //-----------------------------------------------------------------
    public void delete(Magazine mag) {
        if (list == null) return;

        // If first node matches
        if (list.getValue().equals(mag)) {
            list = list.getNext();
            return;
        }

        // Search rest of list
        ListNode current = list;
        while (current.getNext() != null && !current.getNext().getValue().equals(mag)) {
            current = current.getNext();
        }

        // If found, unlink it
        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }
    }

    //-----------------------------------------------------------------
    // Returns this list of magazines as a string.
    //-----------------------------------------------------------------
    public String toString() {
        String result = "";
        ListNode current = list;
        while (current != null) {
            result += current.getValue().toString() + "\n";
            current = current.getNext();
        }
        return result;
    }
}
