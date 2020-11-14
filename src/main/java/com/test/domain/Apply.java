package com.test.domain;

import com.test.domain.user.User;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Apply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "apply_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String startAddr;

    private String startLng;

    private String startLat;

    private String arrivalAddr;

    private String arrivalLng;

    private String arrivalLat;

    private String arrivalTime;

    private String memo;

    @CreatedDate
    private LocalDateTime regdate;
}
