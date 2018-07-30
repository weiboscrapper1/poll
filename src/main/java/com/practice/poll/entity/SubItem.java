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
  @Column(name = "\"id\"")
  private Integer id;
  @Column(name = "\"subject_id\"")
  private Integer subjectId;
  @Column(name = "\"description\"")
  private String description;
  @Column(name = "\"number\"")
  private Integer number;
}