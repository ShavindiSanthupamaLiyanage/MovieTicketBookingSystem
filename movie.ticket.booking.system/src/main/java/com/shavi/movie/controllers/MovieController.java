package com.shavi.movie.controllers;

import com.shavi.movie.request.MovieRequest;
import com.shavi.movie.services.MovieService;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    // Add new movie - POST
//    @Operation(summary = "Add a new movie", description = "Creates a new movie entry")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "201", description = "Movie added successfully"),
//            @ApiResponse(responseCode = "400", description = "Invalid request")
//    })
    @PostMapping("/addNew")
    public ResponseEntity<String> addNewMovie(@RequestBody MovieRequest movieRequest) {
        try{
            String result = movieService.addMovie(movieRequest);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
