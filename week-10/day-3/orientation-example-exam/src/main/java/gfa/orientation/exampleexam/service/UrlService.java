package gfa.orientation.exampleexam.service;

import gfa.orientation.exampleexam.model.Url;
import gfa.orientation.exampleexam.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
  private UrlRepository urlRepository;

  @Autowired
  public UrlService(UrlRepository urlRepository) {
    this.urlRepository = urlRepository;
  }

  public void saveUrl(Url url){
    urlRepository.save(url);
  }

  public boolean isAliasSaved(String alias){
    return urlRepository.findByAlias(alias).orElse(null) != null;
  }
}
