package com.titusnachbauer.stack;

import java.util.EmptyStackException;

public class Stack {

    public boolean isEmpty() {
        return true;
    }

    public int pop() {
        throw new EmptyStackException();
    }
}
