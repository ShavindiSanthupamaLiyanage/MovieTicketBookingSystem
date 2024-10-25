package com.shavi.movie.exceptions;

public class UserExist extends RuntimeException {
    public UserExist() {

        super("User Already Exists with this EmailId");
    }
}
