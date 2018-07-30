package com.practice.poll.entity;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.practice.entity.PollHistory")
@Table(name = "poll_history")
public class PollHistory {

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Long id;
  @Column(name = "\"user_id\"", nullable = false)
  private Long userId;
  @Column(name = "\"subject_id\"", nullable = false)
  private Long subjectId;
  @Column(name = "\"sub_item_id\"", nullable = false)
  private Integer subItemId;
  @Column(name = "\"date\"", nullable = false)
  private Timestamp date;
  @Column(name = "\"ip\"", length = 39)
  private String ip;
}