package com.disney.mapper;

import com.disney.dto.GenreDto;
import com.disney.model.Genre;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IGenreMapper {

    GenreDto genreToGenreDto(Genre genre);
    Genre genreDtoToGenre(GenreDto genreDto);

}
