package com.devsuperior.dsmovie.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ScorePK implements Serializable {

  @ManyToOne
  @JoinColumn(name = "movie_id")
  private Movie movie;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

}
