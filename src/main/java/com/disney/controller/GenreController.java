package com.disney.controller;

import com.disney.dto.GenreDto;
import com.disney.service.IGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/genres")
public class GenreController {

    private final IGenreService genreService;

    @Autowired
    public GenreController(IGenreService genreService){
        this.genreService = genreService;
    }

    @PostMapping
    public ResponseEntity<GenreDto> create(@Valid @RequestBody GenreDto genreDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(genreService.create(genreDto));
    }

}
