package org.viniciusog.patterns.structural.flyweight.MusicFlyweight;

import org.viniciusog.patterns.structural.flyweight.model.Music;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static FlyweightFactory instance = new FlyweightFactory();
    private static Map<String, MusicFlyweight> musicFlyRepository;

    public FlyweightFactory() {
        musicFlyRepository = new HashMap<>();
    }

    public static FlyweightFactory getInstance() {
        return instance;
    }

    public MusicFlyweight getMusic(String desc) {
        MusicFlyweight music = musicFlyRepository.get(desc);
        if (music == null) {
            System.out.println("Creating new Flyweight for: " + desc);
            music = getMusicByString(desc);
            musicFlyRepository.put(desc, music);
        }
        return music;
    }

    private MusicFlyweight getMusicByString(String desc) {
        String[] musicData = desc.split(";");
        return new MusicFlyweight(musicData[0], musicData[1], Integer.parseInt(musicData[2]));
    }

    public Integer getSize() {
        return musicFlyRepository.size();
    }

}
