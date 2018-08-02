package com.practice.poll.domain;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.practice.domain.User")
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Long id;
  @Column(name = "\"name\"", nullable = false, length = 45)
  private String name;
  @Column(name = "\"password\"", nullable = false, length = 32)
  private String password;
}