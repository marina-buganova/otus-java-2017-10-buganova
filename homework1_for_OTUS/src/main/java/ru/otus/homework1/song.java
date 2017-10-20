package ru.otus.homework1;

import com.google.common.base.Joiner;

public class song {
    public static void main (String... args){

        String[] lyrics = {"I'm", "on", "a", "highway", "to", "Hell!"};
        String song = Joiner.on(" ").join(lyrics);

        System.out.println(song);
    }
}
