package com.disney.repository;

import com.disney.model.MovieSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovieSerieRepository extends JpaRepository<MovieSerie, Long> {



}
