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
  @Column(name = "\"subject_id\"", nullable = false)
  private Long subjectId;
  @Column(name = "\"description\"", nullable = false, length = 128)
  private String description;
  @Column(name = "\"number\"", nullable = false)
  private Long number;
}