package com.makarov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>();

    // Instance initialization block
    {
        this.songs.add("Kill - by 30 seconds to mars");
        this.songs.add("Far away - by Nickelback");
        this.songs.add("Numb - by Linkin Park");
    }

    @Override
    public List<String> getSongs() {
        return this.songs;
    }
}
