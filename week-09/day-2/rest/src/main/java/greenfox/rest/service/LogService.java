package greenfox.rest.service;

import greenfox.rest.models.Log;
import greenfox.rest.models.LogActivity;
import greenfox.rest.repository.LogRepository;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class LogService {
  private LogRepository logRepository;


  public LogService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  public LogActivity getLogInfo(){
    LogActivity logActivity = new LogActivity();
    List<Log> entries = new ArrayList<>();
    logRepository.findAll().forEach(entries::add);
    logActivity.setEntries(entries);
    logActivity.setEntry_count(entries.size());
    return logActivity;
  }
}
