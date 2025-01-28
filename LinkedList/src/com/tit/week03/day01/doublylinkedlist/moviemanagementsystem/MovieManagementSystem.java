package com.tit.week03.day01.doublylinkedlist.moviemanagementsystem;
import java.util.Scanner;

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieLinkedList movieList = new MovieLinkedList();
        Scanner scanner = new Scanner(System.in);

        // Sample movies
        movieList.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addAtBeginning("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        movieList.addAtPosition(2, "Interstellar", "Christopher Nolan", 2014, 8.6);

        // Display all movies
        movieList.displayForward();

        // Search example
        System.out.println("\nSearching for movies by Director: Christopher Nolan");
        movieList.searchByDirectorOrRating("Christopher Nolan");

        // Update rating example
        System.out.println("\nUpdating rating for Interstellar:");
        movieList.updateRating("Interstellar", 9.0);
        movieList.displayForward();

        // Display reverse
        movieList.displayReverse();

        // Remove example
        System.out.println("\nRemoving movie: The Godfather");
        movieList.removeByTitle("The Godfather");
        movieList.displayForward();

        scanner.close();
    }
}
