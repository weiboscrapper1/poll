package com.practice.poll.entity;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.practice.entity.PollHistory")
@Table(name = "poll_history",
        indexes = {
        @Index(name = "idx_poll_history_sub_item_id", columnList = "sub_item_id ASC"),
        @Index(name = "idex_poll_history_subject_id", columnList = "subject_id ASC"),
        @Index(name = "idx_poll_history_user_id", columnList = "user_id ASC")})
public class PollHistory {

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Long id;

  @ManyToOne(
          cascade = CascadeType.ALL,
          fetch = FetchType.LAZY)
  @JoinColumn(
          foreignKey = @ForeignKey(name = "fk_poll_history_user_id"),
          name = "user_id",
          referencedColumnName = "id",
          nullable = false)
  private User user;

  @ManyToOne(
          cascade = CascadeType.ALL,
          fetch = FetchType.LAZY)
  @JoinColumn(
          foreignKey = @ForeignKey(name = "fk_poll_history_subject_id"),
          name = "subject_id",
          referencedColumnName = "id",
          nullable = false)
  private PollSubject pollSubject;

  @ManyToOne(
          cascade = CascadeType.ALL,
          fetch = FetchType.LAZY)
  @JoinColumn(
          foreignKey = @ForeignKey(name = "fk_poll_history_sub_item_id"),
          name = "sub_item_id",
          referencedColumnName = "id",
          nullable = false)
  private SubItem subItem;

  @Column(name = "\"date\"", nullable = false)
  private Timestamp date;
  @Column(name = "\"ip\"", length = 39)
  private String ip;
}