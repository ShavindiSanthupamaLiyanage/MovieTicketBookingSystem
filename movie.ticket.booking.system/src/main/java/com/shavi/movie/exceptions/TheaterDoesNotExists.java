package com.shavi.movie.exceptions;

import java.io.Serial;

public class TheaterDoesNotExists extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public TheaterDoesNotExists() {
        super("Theater does not Exists");
    }
}
