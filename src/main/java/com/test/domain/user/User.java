package com.test.domain.user;

import com.test.domain.Apply;
import com.test.domain.Payment;
import com.test.domain.Reservation;
import com.test.domain.Role;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    private String phone;
    private String pw;
    private String email;
    private boolean enable;

    @OneToMany(mappedBy = "user")
    List<UserDetail> userDetails;

    @OneToMany(mappedBy = "user")
    private List<Payment> payments;

    @OneToMany(mappedBy = "user")
    private List<Apply> applies;

    @OneToMany(mappedBy = "user")
    List<Reservation> reservations;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
}
