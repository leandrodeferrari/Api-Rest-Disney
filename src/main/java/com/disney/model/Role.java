package com.disney.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "roles")
@Data
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "ROLE_NAME", length = 50, unique = true, nullable = false)
    private String name;

   @ManyToMany
   @JoinTable(name = "users_roles",
           joinColumns = {
           @JoinColumn(name = "ROLE_ID", referencedColumnName = "id")},
           inverseJoinColumns = {
           @JoinColumn(name = "USER_ID", referencedColumnName = "id")
           }
   )
   private List<User> users;

}
