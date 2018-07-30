package com.practice.poll.entity;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.practice.entity.User")
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"")
  private Integer id;
  @Column(name = "\"name\"")
  private String name;
  @Column(name = "\"password\"")
  private String password;
}