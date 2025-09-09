package com.github.mechanictc;

public class LinkedListInsertionSort {
    
    // Node class for integers
    static class ListNode {
        int value;
        ListNode next;
        ListNode(int val) {
            value = val;
            next = null;
        }
    }

    private ListNode head;

    public LinkedListInsertionSort() {
        head = null;
    }

    // Add integer to end of list
    public void add(int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
        } else {
            ListNode current = head;
            while (current.next != null)
                current = current.next;
            current.next = node;
        }
    }

    // Insertion sort that rearranges the links
    public void insertionSort() {
        if (head == null || head.next == null) return;

        ListNode sorted = null;   // start with empty sorted list
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;  // save next node
            sorted = insertIntoSorted(sorted, current);
            current = next;
        }

        head = sorted; // update head to new sorted list
    }

    // Helper: insert a node into sorted list in the right position
    private ListNode insertIntoSorted(ListNode sorted, ListNode node) {
        if (sorted == null || node.value < sorted.value) {
            node.next = sorted;
            return node;
        } else {
            ListNode current = sorted;
            while (current.next != null && current.next.value <= node.value) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
            return sorted;
        }
    }

    // Print list
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Driver
    public static void main(String[] args) {
        LinkedListInsertionSort list = new LinkedListInsertionSort();
        list.add(29);
        list.add(10);
        list.add(14);
        list.add(37);
        list.add(13);

        System.out.println("Before sorting:");
        list.printList();

        list.insertionSort();

        System.out.println("After insertion sort:");
        list.printList();
    }
}
