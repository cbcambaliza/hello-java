package com.builder;

public class SongData {

    public static class Builder {
        private String title;
        private String artist;
        private String album;
        private int year;

        public Builder(){

        }
        public SongData build(){
            return new SongData(this);
        }

        public Builder title(String title){
            this.title = title;
            return this;
        }
        public Builder artist(String artist){
            this.artist = artist;
            return this;
        }
        public Builder album(String album){
            this.album = album;
            return this;
        }
        public Builder year(int year){
            this.year = year;
            return this;
        }
    }

    private final String title;
    private final String artist;
    private final String album;
    private final int year;

    private SongData(Builder builder){
        this.title = builder.title;
        this.artist = builder.artist;
        this.album = builder.album;
        this.year = builder.year;

    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getYear() {
        return year;
    }
}
