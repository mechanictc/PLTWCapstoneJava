package com.github.mechanictc;

//@author Nathan Kwok
public class LinkedListSelectionSort {
    
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

    public LinkedListSelectionSort() {
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

    // Selection sort (swaps node values)
    public void selectionSort() {
        for (ListNode current = head; current != null; current = current.next) {
            ListNode min = current;
            for (ListNode search = current.next; search != null; search = search.next) {
                if (search.value < min.value) {
                    min = search;
                }
            }
            // Swap values
            if (min != current) {
                int temp = current.value;
                current.value = min.value;
                min.value = temp;
            }
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
        LinkedListSelectionSort list = new LinkedListSelectionSort();
        list.add(29);
        list.add(10);
        list.add(14);
        list.add(37);
        list.add(13);

        System.out.println("Before sorting:");
        list.printList();

        list.selectionSort();

        System.out.println("After selection sort:");
        list.printList();
    }
}
