package blogpost;

public class Main {
  public static void main(String[] args) {
    BlogPost firstBlogPost = new BlogPost("John Doe", "Lorem ipsum dolor sit amet.",
        "Lorem ipsum", "2000.05.04.");

    BlogPost secondBlogPost = new BlogPost("Tim Urban", "Wait but why",
        "2010.10.10.");
    System.out.println(secondBlogPost.getText());
    secondBlogPost
        .setText("A popular long-form, stick-figure-illustrated blog about almost everything.");
    System.out.println(secondBlogPost.getText());

    BlogPost thirdBlogPost = new BlogPost("William Turton", "2017.03.28.");
    System.out.println(thirdBlogPost.getText() + thirdBlogPost.getTitle());
    thirdBlogPost.setText(
        "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention." +
            " When I asked to take his picture outside one of IBM’s New York City offices, he told me " +
            "that he wasn’t really into the whole organizer profile thing.");
    thirdBlogPost.setTitle("One Engineer Is Trying to Get IBM to Reckon With Trump");
    System.out.println(thirdBlogPost.getText() + thirdBlogPost.getTitle());

  }
}
