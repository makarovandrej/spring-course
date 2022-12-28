package com.makarov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") ClassicalMusic classicalMusic, @Qualifier("rockMusic") RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {}


    public void playMusic(MusicType type) {
        Random random = new Random();
        if (type.equals(MusicType.CLASSICAL)) {
            System.out.println("Playing: " + classicalMusic.getSongs().get(random.nextInt(classicalMusic.getSongs().size())));
        } else if (type.equals(MusicType.ROCK)) {
            System.out.println("Playing: " + rockMusic.getSongs().get(random.nextInt(classicalMusic.getSongs().size())));
        } else {
            System.out.println("Unknown type");
        }
    };

}
