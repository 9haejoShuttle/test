package com.test.domain.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter @Setter
@Entity
public class UserDetail {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_detail_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime loginDate;
}
