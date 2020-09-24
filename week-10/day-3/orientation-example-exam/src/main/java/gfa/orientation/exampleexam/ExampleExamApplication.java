package gfa.orientation.exampleexam;

import gfa.orientation.exampleexam.model.Url;
import gfa.orientation.exampleexam.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleExamApplication implements CommandLineRunner {
  private UrlService urlService;

  @Autowired
  public ExampleExamApplication(UrlService urlService) {
    this.urlService = urlService;
  }

  public static void main(String[] args) {
    SpringApplication.run(ExampleExamApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//    Url url = new Url("https://www.reddit.com","red");
//    Url url2 = new Url("https://www.hvg.hu","hvg");
    urlService.saveUrl("https://www.reddit.com","red");
    urlService.saveUrl("https://www.hvg.hu","hvg");
  }
}
