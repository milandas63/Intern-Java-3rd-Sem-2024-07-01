package com.example.videogallery;

public class Main {
    public static void main(String[] args) {
        Video video1 = new Video("Sample Video 1", "https://www.youtube.com/");

        System.out.println("Video 1 Title: " + video1.getTitle());
        System.out.println("Video 1 URL: " + video1.getUrl());

    }
}
