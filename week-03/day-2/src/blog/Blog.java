package blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
  public List<BlogPost> blogPosts;

  public Blog() {
    blogPosts = new ArrayList<>();
  }

  public void add(BlogPost blogPost){
    blogPosts.add(blogPost);
  }

  public void delete(int i){
    blogPosts.remove(i);
  }

  public void update(int i, BlogPost newBlogPost){
    blogPosts.remove(i);
    blogPosts.add(i, newBlogPost);
  }

  @Override
  public String toString() {
    return  blogPosts + " ";
  }
}
