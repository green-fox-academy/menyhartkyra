package greenfox.rest.models;

import java.util.List;
import lombok.Setter;

@Setter
public class LogActivity {
  private List<Log> entries;
  private int entry_count;
}
