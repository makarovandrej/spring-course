package com.makarov.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RapMusic implements Music {

    @Override
    public List<String> getSongs() {
        return null;
    }
}
