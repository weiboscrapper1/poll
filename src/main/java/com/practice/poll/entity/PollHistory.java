package com.practice.poll.entity;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.practice.entity.PollHistory")
@Table(name = "poll_history")
public class PollHistory {

  @Id
  @Column(name = "\"id\"")
  private Integer id;
  @Column(name = "\"user_id\"")
  private Integer userId;
  @Column(name = "\"subject_id\"")
  private Integer subjectId;
  @Column(name = "\"sub_item_id\"")
  private Integer subItemId;
  @Column(name = "\"date\"")
  private Timestamp date;
  @Column(name = "\"ip\"")
  private String ip;
}