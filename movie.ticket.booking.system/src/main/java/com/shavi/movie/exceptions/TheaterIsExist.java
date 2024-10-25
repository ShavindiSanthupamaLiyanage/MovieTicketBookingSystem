package com.shavi.movie.exceptions;

public class TheaterIsExist extends RuntimeException {

  private static final long serialVersionUID = 1L;

    public TheaterIsExist() {

      super("Theater is already Present on this Address");
    }
}
