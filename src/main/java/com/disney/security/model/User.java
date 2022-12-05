package com.disney.security.model;

import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@SQLDelete(sql = "UPDATE users u SET SOFT_DELETE = 1 WHERE u.ID = ?")
@Where(clause = "SOFT_DELETE = 0")
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
    private boolean softDelete = false;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles",
            joinColumns = {
                    @JoinColumn(name = "USER_ID", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "ROLE_ID", referencedColumnName = "id")
            }
    )
    private List<Role> roles;

}
