package com.github.mechanictc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

//@author Nathan Kwok
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> contestants = new ArrayList<>();
		System.out.println("Enter contestant names (type 'quit' to stop):");
		while (true) {
			System.out.print("Enter name: ");
			String name = scanner.nextLine().trim();
			if (name.equalsIgnoreCase("quit")) {
				break;
			}
			if (!name.isEmpty()) {
				contestants.add(name);
			}
		}
		scanner.close();

		if (contestants.isEmpty()) {
			System.out.println("\nNo contestants entered. Program ending.");
			return;
		}
		System.out.println("\n=== ALL CONTESTANTS ===");
		for (String contestant : contestants) {
			System.out.println(contestant);
		}
		ArrayList<String> uniqueContestants = removeDuplicates(contestants);
		System.out.println("\n=== UNIQUE CONTESTANTS (after removing duplicates) ===");
		for (String contestant : uniqueContestants) {
			System.out.println(contestant);
		}
		if (!uniqueContestants.isEmpty()) {
			Random random = new Random();
			int winnerIndex = random.nextInt(uniqueContestants.size());
			String winner = uniqueContestants.get(winnerIndex);
			System.out.println("Winner: " + winner);
		} else {
			System.out.println("\nNo contestants available for drawing.");
		}
	}

	private static ArrayList<String> removeDuplicates(ArrayList<String> list) {
		Set<String> uniqueSet = new HashSet<>(list);
		return new ArrayList<>(uniqueSet);
	}
}