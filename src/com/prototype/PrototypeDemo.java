package com.prototype;

/** Prototype pattern
 * Avoids costly creation
 * Avoids subclassing
 * Typically doesn't use "new"
 * Often utilizes an Interface
 * Usually implemented with a Registry
 * Example: java.lang.Object#clone()
 *
 * Clone/Cloneable
 * Avoids keyword "new"
 * Although a copy, each instance unique
 * Costly construction not handled by client
 * Can still utilize parameters for construction
 * Shallow VS Deep Copy
 */

public class PrototypeDemo {

    public static void main(String[] args){
        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem(ItemTypes.MOVIE);
        movie.setTitle("Ringu");
        System.out.println(movie);
        System.out.println(movie.getTitle());

        Movie movie2 = (Movie) registry.createItem(ItemTypes.MOVIE);
        movie2.setTitle("Ringu 2");
        System.out.println(movie2);
        System.out.println(movie2.getTitle());

        Book book = (Book) registry.createItem(ItemTypes.BOOK);
        book.setTitle("Brave New World");
        System.out.println(book);
        System.out.println(book.getTitle());


    }
}
