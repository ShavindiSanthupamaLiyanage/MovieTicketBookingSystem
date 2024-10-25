package com.shavi.movie.exceptions;

public class SeatsNotAvailable extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public SeatsNotAvailable( ) {
        super("Requested Seats Are Not Available");
    }
}
