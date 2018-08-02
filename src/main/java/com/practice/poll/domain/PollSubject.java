package com.practice.poll.domain;

import java.sql.*;
import java.util.List;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity(name = "com.practice.domain.PollSubject")
@Table(
        name = "poll_subject",
        indexes = {@Index(name = "idx_poll_subject_user_id", columnList = "user_id ASC")})
public class PollSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"id\"", nullable = false)
    private Long id;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinColumn(
            foreignKey = @ForeignKey(name = "fk_poll_subject_user_id"),
            name = "user_id",
            referencedColumnName = "id",
            nullable = false)
    private User user;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "pollSubject",
            fetch = FetchType.LAZY)
    private List<SubItem> subItemList;

    @Column(name = "\"subject\"", nullable = false, length = 128)
    private String subject;

    @Column(name = "\"expiration_time\"", nullable = false)
    private Timestamp expirationTime;
}