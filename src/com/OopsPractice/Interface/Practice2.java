package com.OopsPractice.Interface;

interface MediaPlayer{
    void play();
}

class AudioPlayer implements MediaPlayer{
    @Override
    public void play(){
        System.out.println("Playing Audio !! ");
    }
}

class VideoPlayer implements MediaPlayer{
    @Override
    public void play(){
        System.out.println("Playing Video !! ");
    }
}


public class Practice2 {
    public static void main(String [] args){
           MediaPlayer player;
           player = new AudioPlayer();
           player.play();

           player = new VideoPlayer();
           player.play();
    }
}
