
import java.util.List;

public class UserDataRequest {
  private List<Object> data;
  public List<Object> getData() {
    return data;
  }
  public void setData(List<Object> data) {
    this.data = data;
  }
}

 class UserDataResponse {
  public String status;
  public int userId;
  public String emailId;
  public String collegeRollNumber;
  public List<Integer> evenNumbers;
  public List<Integer> oddNumbers;
  public List<String> upperCaseLetters;
  // getters and setters
}
