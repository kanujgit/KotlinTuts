package com.java.comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * A comparable object is capable of comparing itself with another object.
 * The class itself must implements the java.lang.Comparable interface to compare its instances
 */
public class Comparable {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        list.forEach(System.out::println);

        Collections.sort(list, (s1, s2) ->
                s2.getYear() > s1.getYear() ? -1 :
                        s1.getYear() < s2.getYear() ? 1 : 0);

        System.out.println("Movies after sorting : ");

        list.forEach(System.out::println);

    }
}

class Movie {
    private double rating;
    private String name;
    private Integer year;

    // Used to sort movies by year
//    public int compareTo(Movie m) {
//        return year.compareTo(m.year);
//    }


    // Constructor
    public Movie(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

// Class to compare Movies by ratings
class RatingCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}


