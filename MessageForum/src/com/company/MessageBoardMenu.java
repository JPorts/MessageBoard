package com.company;

public class MessageBoardMenu {
    private MessageBoard board;

    public MessageBoardMenu(MessageBoard messageBoard) {
        board = messageBoard;
    }

    public void displayMessageBoardMenu() {
        board.display();

        int option = 0;
        Keyboard keyboard = new Keyboard();
        do {
            System.out.println("Mein Menu:");
            System.out.println("_-_-_-_-_-_");
            System.out.println("1. Add new topic");
            System.out.println("2. Select a topic to view or post to");
            System.out.println("3. Quit");
            System.out.println("_-_-_-_-_-_");
            System.out.println("Enter Your Choice");
            option = keyboard.nextInt();

            switch(option) {

                case 1:
                    System.out.println("Enter the title of your new topic");
                    String t = keyboard.nextLine();
                    System.out.println("topic is " + t);
                    board.addTopic(new Topic(t));
                    board.display();
                    break;

                case 2:
                    System.out.println("Enter the number of topics you would like to go to: ");
                    int choice = keyboard.nextInt();
                    if(choice >= 0 && choice < board.getNumberOfTopics() ){
                        Topic topic = board.getTopic(choice);
                        System.out.println("Topic: " + choice + "(" + topic.getTitle() + ") selected");
                        new TopicMenu(topic, keyboard).displayTopicMenu();
                    } else {
                        System.out.println("Invalid Index.");
                    }
                    break;

                case 3:
                    System.out.println("Goodbye.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option, please enter one of the options above.");
                    displayMessageBoardMenu();

            }
        } while (option != 3);

    }
}
