package com.practice.poll.entity;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.practice.entity.SubItem")
@Table(name = "sub_item")
public class SubItem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "\"subject_id\"", referencedColumnName = "id", nullable = false)
  private PollSubject pollSubject;

  @Column(name = "\"description\"", nullable = false, length = 128)
  private String description;
  @Column(name = "\"number\"", nullable = false)
  private Long number;
}