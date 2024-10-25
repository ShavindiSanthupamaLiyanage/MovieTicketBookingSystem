package com.shavi.movie.request;

import lombok.Data;

@Data
public class ShowSeatRequest {
    private Integer showId;
    private Integer priceOfPremiumSeat;
    private Integer priceOfClassicSeat;
}
