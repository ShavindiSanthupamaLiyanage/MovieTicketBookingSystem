package com.shavi.movie.exceptions;

import java.io.Serial;

public class MovieAlreadyExist extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public MovieAlreadyExist(){
        super("Movie Already Exist with Same Name and Language");
    }
}
