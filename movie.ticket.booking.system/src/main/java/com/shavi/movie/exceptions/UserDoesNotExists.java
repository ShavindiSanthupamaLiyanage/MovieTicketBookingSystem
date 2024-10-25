package com.shavi.movie.exceptions;

public class UserDoesNotExists extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UserDoesNotExists() {

        super("User does not exists");
    }
}
