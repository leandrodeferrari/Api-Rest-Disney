package com.disney.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "genres")
@Data
public class Genre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "GENRE_NAME", unique = true, length = 30, nullable = false)
    private String name;

    @Column(name = "URL_IMAGE", length = 50)
    private String urlImage;

    @ManyToMany
    @JoinTable(name = "movies_series_genres",
            joinColumns = {
                    @JoinColumn(name = "GENRE_ID", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "MOVIE_SERIE_ID", referencedColumnName = "id")
            }
    )
    private List<MovieSerie> moviesSeries;

}
