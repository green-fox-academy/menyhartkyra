package greenfox.rest.models;

public class Error {
  private String error;

  public Error(String missingParameters) {
    error = "Please provide " + missingParameters + "!";
  }

  public String getError() {
    return error;
  }
}
