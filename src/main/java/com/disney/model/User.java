package com.disney.model;

import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@SQLDelete(sql = "UPDATE users SET softDelete = true WHERE id=?")
@Where(clause = "softDelete = false")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "USER_NAME", unique = true, length = 50, nullable = false)
    private String userName;

    @Column(name = "EMAIL", unique = true, length = 50, nullable = false)
    private String email;

    @Column(name = "USER_PASSWORD", nullable = false)
    private String password;

    @Column(name = "CREATION_DATE", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "UPDATE_DATE")
    private LocalDateTime updateDate;

    @Column(name = "SOFT_DELETE", nullable = false)
    private boolean softDelete;

    // Missing roles attribute.

}
