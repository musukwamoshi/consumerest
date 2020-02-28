
package  com.test.consumerest.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteDTO {

  private String type;
  private Value value;

  public QuoteDTO() {
  }

  public String getType() {
    return this.type;
  }

  public Value getValue() {
    return this.value;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setValue(Value value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "QuoteDTO{" +
        "type=" + type +
        ", value='" + value + '\'' +
        '}';
  }
}