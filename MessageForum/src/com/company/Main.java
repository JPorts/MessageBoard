package com.company;

public class Main {
    MessageBoard mb;
    MessageBoardMenu menu;

    public Main(String t) {
        mb = new MessageBoard(t);
        menu = new MessageBoardMenu(mb);
    }

    public void start() {
        menu.displayMessageBoardMenu();
    }


    public static void main(String[] args) {

        try{
            Main main = new Main("Simple Message Board 1");
            main.start();
        } catch(Exception e) {
            e.printStackTrace();
        }


    }
}
