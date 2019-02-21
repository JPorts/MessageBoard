package com.company;

import java.util.ArrayList;
import java.util.List;

public class MessageBoard {
    private final String mbTitle;
    private List<Topic> topics;

    public MessageBoard(String name){
        mbTitle = name;
        topics = new ArrayList<Topic>();
    }

    public void addTopic(Topic t){
        topics.add(t);
    }

    public Topic getTopic(int n){
        return topics.get(n);
    }

    public int getNumberOfTopics() {
        return topics.size();
    }

    public void display() {
        System.out.println(mbTitle);
        System.out.println("_-_-_-_-_-_");
        for(int i = 0; i< topics.size(); i++) {
            System.out.println(String.format("%d: %s", i, topics.get(i).toString()));
        }
    }

}
