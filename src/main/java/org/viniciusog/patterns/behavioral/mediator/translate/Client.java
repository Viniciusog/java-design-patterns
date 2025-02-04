package org.viniciusog.patterns.behavioral.mediator.translate;

import org.viniciusog.patterns.behavioral.mediator.translate.mediator.ChatMediator;
import org.viniciusog.patterns.behavioral.mediator.translate.mediator.Mediator;
import org.viniciusog.patterns.behavioral.mediator.translate.mediator.TranslatorMediator;
import org.viniciusog.patterns.behavioral.mediator.translate.model.EnglishUser;
import org.viniciusog.patterns.behavioral.mediator.translate.model.PortugueseUser;
import org.viniciusog.patterns.behavioral.mediator.translate.model.User;

public class Client {

    public static void main(String[] args) {

        Mediator chatRoom = new TranslatorMediator();
        //Mediator chatRoom = new ChatMediator();

        User sophie = new EnglishUser("Sophie", chatRoom);
        User vinicius = new PortugueseUser("Vinicius", chatRoom);
        User bill = new EnglishUser("Bill", chatRoom);
        User joao = new PortugueseUser("João", chatRoom);

        chatRoom.addUser(sophie);
        chatRoom.addUser(vinicius);
        chatRoom.addUser(bill);
        chatRoom.addUser(joao);

        vinicius.sendMessage("Oi", bill);
        vinicius.sendMessage("Tudo bem?", sophie);

        bill.sendMessage("How are you?", joao);
        joao.sendMessage("Estou bem, obrigado.", bill);

        sophie.sendMessage("Bye");
        chatRoom.removeUser(sophie);
    }
}
