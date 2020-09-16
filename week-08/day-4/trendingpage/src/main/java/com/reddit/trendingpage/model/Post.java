package com.reddit.trendingpage.model;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Getter
@Setter
@Table(name = "posts")
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String title;
  private String url;
  private int votes;
  @CreationTimestamp
  private Date date;
}
