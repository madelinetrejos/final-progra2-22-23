package com.progra.hangman.exceptions;

public class InvalidIdException extends NumberFormatException{
    public InvalidIdException(String text) {
        super(text);
    }
}
