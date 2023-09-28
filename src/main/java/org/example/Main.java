package org.example;

public class Main {
    public static void main(String[] args) {

        MediaController mediaController1 = new MediaController();
        Playable videoPlayer1 = new VideoPlayer();
        Playable musicPlayer1 = new MusicPlayer();
        mediaController1.playMedia(videoPlayer1);
        mediaController1.playMedia(musicPlayer1);
        // mediaController1.playMedia(new VideoPlayer());
        // mediaController1.playMedia(new MusicPlayer());
    }
}