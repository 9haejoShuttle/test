package com.test.domain.user;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class UserHistory {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_histroy_id")
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    private String state;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String memo;
}

