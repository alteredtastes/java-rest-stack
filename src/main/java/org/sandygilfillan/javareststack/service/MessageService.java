package org.sandygilfillan.javareststack.service;

import org.sandygilfillan.javareststack.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageService {

    public List<Message> getAllMessages() {
        Message m1 = new Message(1L, "Hello World!", "Sandy");
        Message m2 = new Message(2L, "Hi there, World!", "Sandman");
        List<Message> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        return list;
    }

}
