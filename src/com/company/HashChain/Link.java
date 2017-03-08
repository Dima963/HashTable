package com.company.HashChain;

/**
 * Created by Dima on 08.03.2017.
 */
public class Link {

    private int date;
    //next element
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
