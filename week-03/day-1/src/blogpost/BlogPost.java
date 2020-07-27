package blogpost;

public class BlogPost {

  private String authorName;
  private String title;
  private String text;
  private String publicationDate;

  public BlogPost(String authorName, String text, String title, String publicationDate){
    this.authorName = authorName;
    this.publicationDate = publicationDate;
    this.text = text;
    this.title = title;
  }

  public BlogPost(String authorName, String title, String publicationDate){
    this(authorName, null, title,publicationDate);
  }

  public BlogPost(String authorName, String publicationDate){
    this(authorName, null, publicationDate);
  }

  public String getAuthorName() {
    return authorName;
  }

  public String getText() {
    return text;
  }

  public String getPublicationDate() {
    return publicationDate;
  }

  public String getTitle() {
    return title;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
