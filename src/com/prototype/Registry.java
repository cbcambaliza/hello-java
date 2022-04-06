package com.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<ItemTypes, Item> items = new HashMap<ItemTypes, Item>();

    public Registry(){
        loadItems();
    }

    public Item createItem (ItemTypes type) {
        Item item = null;
        try {
            item = (Item)(items.get(type)).clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put(ItemTypes.MOVIE, movie);

        Book book = new Book();
        book.setTitle("Booc");
        book.setPrice(19.99);
        book.setNumberOfPages(399);
        items.put(ItemTypes.BOOK, book);
    }
}
