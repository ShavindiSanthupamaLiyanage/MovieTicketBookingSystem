package com.shavi.movie.exceptions;

public class ShowDoesNotExists extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ShowDoesNotExists() {

        super("Show does not exists");
    }
}
