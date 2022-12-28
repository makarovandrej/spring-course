package com.makarov.springcourse;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.makarov.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
//    @Bean
//    @Scope("singleton")
//    public ClassicalMusic classicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    @Bean
//    public RockMusic rockMusic() {
//        return new RockMusic();
//    }
//
//    @Bean
//    public MusicPlayer musicPlayer() {
//        return new MusicPlayer(classicalMusic(), rockMusic());
//    }
//
//    @Bean
//    public Computer computer() {
//        return new Computer(musicPlayer());
//    }
}
