package com.reddit.trendingpage.controller;

import com.reddit.trendingpage.model.Post;
import com.reddit.trendingpage.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class PostController {
  private final PostService postService;

  @RequestMapping(path = "/")
  public String renderMainPage(Model model){
    model.addAttribute("posts",postService.getPosts());
    return "mainpage";
  }

  @RequestMapping(path = "/add-new-post", method = RequestMethod.GET)
  public String renderNewPostPage(Model model) {
    model.addAttribute("post",new Post());
    return "add-new-post";
  }

  @RequestMapping(path = "/add-new-post", method = RequestMethod.POST)
  public String addNewPostPost(@ModelAttribute Post post) {
    postService.save(post);
    return "redirect:/";
  }

  @RequestMapping(path = "/upvote", method = RequestMethod.POST)
  public String upvote(int upvotedPostId){
    postService.upvote(upvotedPostId);
    return "redirect:/";
  }

  @RequestMapping(path = "/downvote", method = RequestMethod.POST)
  public String downvote(int downvotedPostId){
    postService.downvote(downvotedPostId);
    return "redirect:/";
  }
}
