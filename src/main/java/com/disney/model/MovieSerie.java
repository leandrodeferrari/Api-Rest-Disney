package com.disney.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "movies_series")
@Data
public class MovieSerie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "TITLE", length = 50, nullable = false)
    private String title;

    @Column(name = "CREATION_DATE", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "QUALIFICATION", nullable = false)
    private byte qualification;

    @Column(name = "URL_IMAGE", length = 50)
    private String urlImage;

    @ManyToMany
    @JoinTable(name = "movies_series_characters",
            joinColumns = {
                    @JoinColumn(name = "MOVIE_SERIE_ID", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "CHARACTER_ID", referencedColumnName = "id")
            }
    )
    private List<Character> characters;

    @ManyToMany
    @JoinTable(name = "movies_series_genres",
            joinColumns = {
                    @JoinColumn(name = "MOVIE_SERIE_ID", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "GENRE_ID", referencedColumnName = "id")
            }
    )
    private List<Genre> genres;

}
