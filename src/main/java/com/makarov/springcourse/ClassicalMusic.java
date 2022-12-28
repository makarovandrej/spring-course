package com.makarov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<>();

    // Instance initialization block
    {
        this.songs.add("Hungarian Rhapsody");
        this.songs.add("Primavera - by Ludovico Einaudi");
        this.songs.add("Devenire - by Ludovico Einaudi");
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Initialization..");
    }

    // Will not be invoked for prototype scope
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destruction..");
    }

    @Override
    public List<String> getSongs() {
        return this.songs;
    }
}
