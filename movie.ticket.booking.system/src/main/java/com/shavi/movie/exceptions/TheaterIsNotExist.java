package com.shavi.movie.exceptions;

public class TheaterIsNotExist extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public TheaterIsNotExist() {

        super("Theater is not present in this address");
    }
}
