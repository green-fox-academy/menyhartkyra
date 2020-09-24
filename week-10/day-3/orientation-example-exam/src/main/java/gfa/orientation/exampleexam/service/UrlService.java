package gfa.orientation.exampleexam.service;

import gfa.orientation.exampleexam.exception.NotFoundException;
import gfa.orientation.exampleexam.model.Url;
import gfa.orientation.exampleexam.repository.UrlRepository;
import java.util.List;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UrlService {
  private UrlRepository urlRepository;
  //private Object ResponseStatusException;

  @Autowired
  public UrlService(UrlRepository urlRepository) {
    this.urlRepository = urlRepository;
    //ResponseStatusException = new ResponseStatusException(HttpStatus.NOT_FOUND);
  }

  public void saveUrl(String urlAddress, String alias) {
    Url url = new Url(urlAddress, alias);
    urlRepository.save(url);
  }

  public void saveUrl(Url url) {
    urlRepository.save(url);
  }

  public boolean isAliasSaved(String alias) {
    return urlRepository.findByAlias(alias).orElse(null) != null;
  }

  public Url getUrlByAlias(String alias) {
    return urlRepository.findByAlias(alias)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
  }

  public String getUrlAddressByAlias(String alias) {
    return getUrlByAlias(alias).getUrl();
  }

  public int getSecretCodeByAlias(String alias) {
    return getUrlByAlias(alias).getSecretCode();
  }

  public List<Url> getUrls(){
    return urlRepository.findAll();
  }
}
