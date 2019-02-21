package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Topic {
    private List<Message> messages;
    private String title;


    public Topic(String t) {
        messages = new ArrayList<Message>();
        title = t;
    }

    public String displayTopic(){
        StringBuilder sb = new StringBuilder();
        sb.append(title); sb.append('\n');
        sb.append("-_-_-_-_-_-_-_-\n");
        for(int i=0; i < messages.size(); i++) {
            Message m = messages.get(i);
            sb.append(String.format("%d: %s\n", i, m.displayMessage()));
        }
        return sb.toString();
    }

    public List<Message> getMessages(){
    return Collections.unmodifiableList(messages);
    }

    public void addMessage(Message m) {
    messages.add(m);
    }

    public Message removeMessage(int index) {
    if(index < 0 || index >= messages.size()) {
        return null;
    }
    return messages.remove(index);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Topic: ");
        sb.append(title);
        for(Message m : messages) {
            sb.append(m.displayMessage());
        }
        return sb.toString();
    }
}
