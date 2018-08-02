package com.practice.poll.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity(name = "com.practice.entity.SubItem")
@Table(
        name = "sub_item",
        indexes = {@Index(name = "idx_sub_item_subject_id", columnList = "subject_id ASC")})
public class SubItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"id\"", nullable = false)
    private Long id;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinColumn(
            foreignKey = @ForeignKey(name = "fk_sub_item_subject_id"),
            name = "\"subject_id\"",
            referencedColumnName = "id",
            nullable = false)
    private PollSubject pollSubject;

    @Column(name = "\"description\"", nullable = false, length = 128)
    private String description;
    @Column(name = "\"number\"", nullable = false)
    private Long number;
}