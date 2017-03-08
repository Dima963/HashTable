package com.company.HashChain;

public class Link {

    private int date;
    public Link next;

    public Link(int date) {
        this.date = date;
    }

    public int getKey() {
        return date;
    }

    public void displayLink(){
        System.out.print(date + " ");
    }
}
