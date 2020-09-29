package com.rui.pirate.Card;

public class Card {
    private String name;

    public Gold gold;
    public Diamond diamond;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card(String name) {
        this.name = name;
        if (name.equals("Gold")) {
            gold = new Gold();
        } else if (name.equals("Diamond")) {
            diamond = new Diamond();
        }
    }
}
