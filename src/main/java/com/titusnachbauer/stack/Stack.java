package com.titusnachbauer.stack;

import java.util.EmptyStackException;

public class Stack {
    private boolean empty = true;

    public boolean isEmpty() {
        return empty;
    }

    public int pop() {
        if (empty) {
            throw new EmptyStackException();
        }
        empty = true;
        return -1;
    }

    public void push(int i) {
        empty = false;
    }
}
