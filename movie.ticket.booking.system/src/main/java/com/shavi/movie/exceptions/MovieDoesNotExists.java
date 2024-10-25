package com.shavi.movie.exceptions;

import java.io.Serial;

public class MovieDoesNotExists extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public MovieDoesNotExists() {
        super("Movie Does Not Exists");
    }
}
