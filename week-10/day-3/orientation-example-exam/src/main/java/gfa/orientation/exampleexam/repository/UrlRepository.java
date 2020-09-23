package gfa.orientation.exampleexam.repository;

import gfa.orientation.exampleexam.model.Url;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends CrudRepository<Url, Integer> {
  Optional<Url> findByAlias(String alias);
}
