package gfa.orientation.exampleexam.service;

import gfa.orientation.exampleexam.model.Url;
import gfa.orientation.exampleexam.model.UrlSecretCode;
import gfa.orientation.exampleexam.repository.UrlRepository;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UrlService {
  private UrlRepository urlRepository;

  @Autowired
  public UrlService(UrlRepository urlRepository) {
    this.urlRepository = urlRepository;
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

/*  private UrlSecretCode convertUrltoUrlSecretCode(Url url){
    UrlSecretCode urlSecretCode = new UrlSecretCode();
    ModelMapper mapper = new ModelMapper();
    mapper.map(url,urlSecretCode);
    return urlSecretCode;
  }*/

  private boolean secretCodesMatch(UrlSecretCode urlSecretCode, int id){
    Url url = urlRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    return urlSecretCode.getSecretCode() == url.getSecretCode();
  }

  public void deleteUrlById(UrlSecretCode urlSecretCode, int id){
    if (secretCodesMatch(urlSecretCode,id)){
      urlRepository.deleteById(id);
    } else {
      throw new ResponseStatusException(HttpStatus.FORBIDDEN);
    }
  }
}
