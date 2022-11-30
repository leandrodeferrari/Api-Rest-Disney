package com.disney.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "characters")
@Data
public class Character implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "AGE", nullable = false)
    private byte age;

    @Column(name = "WEIGHT", nullable = false)
    private Double weight;

    @Column(name = "CHARACTER_NAME", length = 50, nullable = false)
    private String name;

    @Column(name = "URL_IMAGE", length = 50)
    private String urlImage;

    @Column(name = "CHARACTER_HISTORY")
    private String history;

    // Missing moviesSeries attribute.
    
}