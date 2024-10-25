package com.shavi.movie.request;

import com.shavi.movie.enums.Genre;
import com.shavi.movie.enums.Language;
import lombok.Data;


import java.sql.Date;

@Data
public class MovieRequest {
    private String movieName;
    private Integer duration;
    private Double rating;
    private Date releaseDate;
    private Genre genre;
    private Language language;
}
