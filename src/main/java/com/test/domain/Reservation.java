package com.test.domain;

import com.test.domain.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter @Setter
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;

    private Long routeId;

    private LocalDateTime startTime;

    private LocalDateTime arrivalDate;

    private int seatNum;

}
