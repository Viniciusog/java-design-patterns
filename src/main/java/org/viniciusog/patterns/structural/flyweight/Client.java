package org.viniciusog.patterns.structural.flyweight;

import org.viniciusog.patterns.structural.flyweight.MusicFlyweight.FlyweightFactory;
import org.viniciusog.patterns.structural.flyweight.MusicFlyweight.MusicFlyweight;
import org.viniciusog.patterns.structural.flyweight.model.Music;
import org.viniciusog.patterns.structural.flyweight.service.MusicService;

public class Client {

    public static void main(String[] args) {
        FlyweightFactory.getInstance().getMusic("The sun;Vinicius;360");
        FlyweightFactory.getInstance().getMusic("Hey Jude;The Beatles;420");
        MusicService service = new MusicService();
        service.report();
        System.out.println("------");
        service.listenMusic("Roberto", "The sun;Vinicius;360");
        service.listenMusic("Ana", "Hey Jude;The Beatles;420");
        service.listenMusic("Vinicius", "Hey Jude;The Beatles;420");
        service.listenMusic("Ana", "Hey Jude;The Beatles;420");
        service.report();
    }
}
