package com.reddit.trendingpage.repository;

import com.reddit.trendingpage.model.Post;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {
  List<Post> findAll();

  @Query(value = "SELECT * FROM posts p ORDER BY p.votes DESC LIMIT 10", nativeQuery = true)
  List<Post> findFirst10OrderByVotesDesc();
}
