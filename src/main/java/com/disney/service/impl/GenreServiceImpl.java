package com.disney.service.impl;

import com.disney.dto.GenreDto;
import com.disney.mapper.IGenreMapper;
import com.disney.model.Genre;
import com.disney.repository.IGenreRepository;
import com.disney.service.IGenreService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GenreServiceImpl implements IGenreService {

    private final IGenreMapper genreMapper;
    private final IGenreRepository genreRepository;

    public GenreServiceImpl(IGenreMapper genreMapper, IGenreRepository genreRepository){
        this.genreMapper = genreMapper;
        this.genreRepository = genreRepository;
    }

    @Transactional
    @Override
    public GenreDto create(GenreDto genreDto) {

        Genre genre = genreMapper.genreDtoToGenre(genreDto);
        genreRepository.save(genre);

        return genreMapper.genreToGenreDto(genre);

    }

}
