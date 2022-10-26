package com.indev.auth.security.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String username;
    @NotNull
    private String name;
    @NotNull
    private String password;
    @NotNull
    private String email;

    @NotNull
    @ManyToMany
    @JoinTable(name = "users_level", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "level_id"))
    private Set<Level> level = new HashSet<Level>();
}
