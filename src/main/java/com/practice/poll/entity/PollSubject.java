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
  @Column(name = "\"id\"")
  private Integer id;
  @Column(name = "\"user_id\"")
  private Integer userId;
  @Column(name = "\"subject\"")
  private String subject;
  @Column(name = "\"expiration_time\"")
  private Timestamp expirationTime;
}