package com.reddit.trendingpage.service;

import com.reddit.trendingpage.model.Post;
import com.reddit.trendingpage.repository.PostRepository;
import java.awt.print.Book;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
  private final PostRepository postRepository;

  public void save(Post post){
    //post.setDate(new Date());
    postRepository.save(post);
  }

  public List<Post> getPosts(){
    return postRepository.findAll();
  }
  public void upvote(int id){

    Post post = postRepository.findById(id).orElseThrow(NoSuchElementException::new);
    post.setVotes(post.getVotes()+1);
    postRepository.save(post);
  }

  public void downvote(int id){
    Post post = postRepository.findById(id).orElseThrow(NoSuchElementException::new);
    post.setVotes(post.getVotes()-1);
    postRepository.save(post);
  }

  public List<Post> getFirst10Post(){
    return postRepository.findFirst10OrderByVotesDesc();
  }
}
