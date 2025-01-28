package com.tit.week03.day01.doublylinkedlist.moviemanagementsystem;
public class MovieLinkedList {
    private MovieNode head;
    private MovieNode tail;

    // Add movie at the beginning
    public void addAtBeginning(String title, String director, int yearOfRelease, double rating) {
        MovieNode newMovie = new MovieNode(title, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add movie at the end
    public void addAtEnd(String title, String director, int yearOfRelease, double rating) {
        MovieNode newMovie = new MovieNode(title, director, yearOfRelease, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add movie at a specific position
    public void addAtPosition(int position, String title, String director, int yearOfRelease, double rating) {
        if (position <= 0) {
            System.out.println("Invalid position. Use 1 or higher.");
            return;
        }

        MovieNode newMovie = new MovieNode(title, director, yearOfRelease, rating);

        if (position == 1) {
            addAtBeginning(title, director, yearOfRelease, rating);
            return;
        }

        MovieNode temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
        } else {
            newMovie.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newMovie;
            } else {
                tail = newMovie;
            }
            temp.next = newMovie;
            newMovie.prev = temp;
        }
    }

    // Remove a movie by title
    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("No movies to remove.");
            return;
        }

        MovieNode temp = head;
        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found: " + title);
        } else {
            if (temp == head) {
                head = head.next;
                if (head != null) head.prev = null;
            } else if (temp == tail) {
                tail = tail.prev;
                if (tail != null) tail.next = null;
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            System.out.println("Movie removed: " + title);
        }
    }

    // Search for movies by Director or Rating
    public void searchByDirectorOrRating(String searchQuery) {
        boolean found = false;
        MovieNode temp = head;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(searchQuery) ||
                    String.valueOf(temp.rating).equals(searchQuery)) {
                System.out.println("Movie Found:\n" + formatMovie(temp));
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movie found for query: " + searchQuery);
        }
    }

    // Update movie rating by title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Updated rating for " + title + " to " + newRating);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found: " + title);
    }

    // Display all movies in forward order
    // Display all movies in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("No movie records found.");
            return;
        }

        System.out.println("\nMovies in forward order:");
        MovieNode temp = head;
        while (temp != null) {
            System.out.println("Movie Title: " + temp.title);
            System.out.println("Director: " + temp.director);
            System.out.println("Year of Release: " + temp.yearOfRelease);
            System.out.println("Rating: " + temp.rating);
            System.out.println();
            temp = temp.next;
        }
    }

    // Display all movies in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movie records found.");
            return;
        }

        System.out.println("\nMovies in reverse order:");
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println("Movie Title: " + temp.title);
            System.out.println("Director: " + temp.director);
            System.out.println("Year of Release: " + temp.yearOfRelease);
            System.out.println("Rating: " + temp.rating);
            System.out.println();
            temp = temp.prev;
        }
    }


    // Helper method to format movie information
    private String formatMovie(MovieNode movie) {
        return "Title: " + movie.title +
                "\nDirector: " + movie.director +
                "\nYear of Release: " + movie.yearOfRelease +
                "\nRating: " + movie.rating + "\n";
    }
}
