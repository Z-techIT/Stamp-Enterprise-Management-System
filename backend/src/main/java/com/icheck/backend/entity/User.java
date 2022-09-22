package com.icheck.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 11)
    private String phone;

    @Column(length = 100)
    private String email;

    @Column(length = 100)
    private String password;

    @Column(length = 150)
    private String taxCode;

    @Column(length = 50)
    private String city;

    @Column(length = 50)
    private String district;

    @Column
    private String address;

    @Column
    private int status;

    @Column
    private LocalDateTime created_at;

    @Column
    private LocalDateTime update_at;
}
