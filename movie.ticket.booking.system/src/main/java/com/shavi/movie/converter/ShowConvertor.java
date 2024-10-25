package com.shavi.movie.converter;

import com.shavi.movie.entities.Show;
import com.shavi.movie.request.ShowRequest;

public class ShowConvertor {
    public static Show showDtoToShow(ShowRequest showRequest) {
        Show show = Show.builder()
                .time(showRequest.getShowStartTime())
                .date(showRequest.getShowDate())
                .build();

        return show;
    }
}
