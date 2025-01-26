package org.viniciusog.patterns.structural.flyweight.service;

import org.viniciusog.patterns.structural.flyweight.MusicFlyweight.FlyweightFactory;
import org.viniciusog.patterns.structural.flyweight.MusicFlyweight.MusicFlyweight;
import org.viniciusog.patterns.structural.flyweight.model.Music;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MusicService {

    private Map<String, Map<String, Music>> memory;

    public MusicService() {
        this.memory = new HashMap<>();
    }

    public void listenMusic(String user, String desc) {
        Map<String, Music> userPlaylist = memory.get(user);

        if (userPlaylist == null) {
            userPlaylist = new HashMap<>();
            memory.put(user, userPlaylist);
        }

        Music song = userPlaylist.get(desc);
        if (song == null) {
            song = new Music(FlyweightFactory.getInstance().getMusic(desc));
            userPlaylist.put(desc, song);
            System.out.printf("%s is listenning to %s \n", user, song.getMusicFlyweight().getName());
        }
        song.listenning();
    }

    public void report() {
        Set<String> users = memory.keySet();
        for (String user: users) {
            int timeCounter = 0;
            System.out.println("-----------");
            System.out.println(user + " has listen to....\n");
            Collection<Music> musics = memory.get(user).values();
            for (Music music : musics) {
                System.out.printf("\n%s, %s -> %d times \n",
                        music.getMusicFlyweight().getArtist(),
                        music.getMusicFlyweight().getName(),
                        music.getPlayerQty());
                int totalSecondsListened = music.getPlayerQty() * music.getMusicFlyweight().getDurationInSeconds();
                timeCounter += totalSecondsListened;
            }
            System.out.printf("%s has listen music for %s seconds \n", user, timeCounter);
        }
        System.out.println("Total musics in flyweigth's memory: "
                + FlyweightFactory.getInstance().getSize());
    }
}