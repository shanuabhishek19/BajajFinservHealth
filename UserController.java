
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
  
  @PostMapping("/user-data")
  public ResponseEntity<UserDataResponse> getUserData(@RequestBody UserDataRequest request) {
    // extract the data from the request array and prepare the response
    int userId = 123;
    String emailId = "user@example.com";
    String collegeRollNumber = "XYZ123";
    List<Integer> evenNumbers = new ArrayList<>();
    List<Integer> oddNumbers = new ArrayList<>();
    List<String> upperCaseLetters = new ArrayList<>();
    for (Object item : request.getData()) {
      if (item instanceof Integer) {
        int number = (int) item;
        if (number % 2 == 0) {
          evenNumbers.add(number);
        } else {
          oddNumbers.add(number);
        }
      } else if (item instanceof String) {
        String letter = (String) item;
        if (letter.matches("[a-zA-Z]")) {
          upperCaseLetters.add(letter.toUpperCase());
        }
      }
    }
    // construct the response object
    UserDataResponse response = new UserDataResponse();
    response.setStatus("success");
    response.setUserId(userId);
    response.setEmailId(emailId);
    response.setCollegeRollNumber(collegeRollNumber);
    response.setEvenNumbers(evenNumbers);
    response.setOddNumbers(oddNumbers);
    response.setUpperCaseLetters(upperCaseLetters);
    return ResponseEntity.ok(response);
  }

    private static class UserDataResponse {

        public UserDataResponse() {
        }

        private void setStatus(String success) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setUserId(int userId) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setEmailId(String emailId) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setCollegeRollNumber(String collegeRollNumber) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setEvenNumbers(List<Integer> evenNumbers) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setOddNumbers(List<Integer> oddNumbers) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setUpperCaseLetters(List<String> upperCaseLetters) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class ResponseEntity<T> {

        private static ResponseEntity<UserDataResponse> ok(UserDataResponse response) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public ResponseEntity() {
        }
    }

    private static class UserDataRequest {

        public UserDataRequest() {
        }

        private Iterable<Object> getData() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
