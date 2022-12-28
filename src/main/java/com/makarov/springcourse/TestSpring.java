package com.makarov.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Computer computer = context.getBean("computer", Computer.class);
        computer.getMusicPlayer().playMusic(MusicType.CLASSICAL);
        context.close();

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
//
//        Computer computer = context.getBean("computer", Computer.class);
//
//        MusicPlayer musicPlayer = computer.getMusicPlayer();
//        musicPlayer.playMusic(MusicType.CLASSICAL);
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
//
//        System.out.println(classicalMusic1 == classicalMusic2);
//
//        context.close();
    }
}
