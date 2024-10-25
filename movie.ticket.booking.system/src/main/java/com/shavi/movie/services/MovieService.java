package com.shavi.movie.services;

import com.shavi.movie.converter.MovieConvertor;
import com.shavi.movie.entities.Movie;
import com.shavi.movie.exceptions.MovieAlreadyExist;
import com.shavi.movie.repositories.MovieRepository;
import com.shavi.movie.request.MovieRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public String addMovie(MovieRequest movieRequest){
        Movie movieByName = movieRepository.findByMovieName(movieRequest.getMovieName());

        if(movieByName != null && movieByName.getLanguage().equals(movieRequest.getLanguage())){
            throw new MovieAlreadyExist();
        }

        Movie movie = MovieConvertor.movieDtoToMovie(movieRequest);

        movieRepository.save(movie);

        // Return success message
        return "Movie added successfully: " + movie.getMovieName();

    }
}
