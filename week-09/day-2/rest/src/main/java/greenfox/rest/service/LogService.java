package greenfox.rest.service;

import greenfox.rest.models.Log;
import greenfox.rest.repository.LogRepository;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class LogService {
  private List<Log> entries;
  private int entry_count;

  public LogService(LogRepository logRepository) {
    entries = new ArrayList<>();
    logRepository.findAll().forEach(log -> entries.add(log));
    entry_count = entries.size();
  }
}
