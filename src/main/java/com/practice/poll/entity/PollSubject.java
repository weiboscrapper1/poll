package com.practice.poll.entity;

import java.sql.*;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity(name = "com.practice.entity.PollSubject")
@Table(name = "poll_subject")
public class PollSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"id\"", nullable = false)
    private Long id;

//    @Column(name = "\"user_id\"", nullable = false)
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_id", referencedColumnName="id", nullable = false)
    private User user;

    @Column(name = "\"subject\"", nullable = false, length = 128)
    private String subject;
    @Column(name = "\"expiration_time\"", nullable = false)
    private Timestamp expirationTime;
}