package com.builder;

/** Builder pattern
 * Handles complex constructors
 * Large number of parameters
 * Immutability
 * Examples: StringBuilder, DocumentBuilder, Locale.Builder
 *
 * Flexibility over telescoping constructors
 * static inner class
 * Calls appropriate constructor
 * negates the need for exposed setters
 * Java 1.5+ can take advantage of Generics
 **/

public class BuilderDemo {

    public static void main(String[] args){

        SongData.Builder builder = new SongData.Builder();

        builder.title("New Rules").artist("Dua Lipa").album("Dua Lipa").year(2017);

        SongData songData = builder.build();

        System.out.println(songData.getTitle());
        System.out.println(songData.getArtist());
        System.out.println(songData.getAlbum());
        System.out.println(songData.getYear());

    }
}
