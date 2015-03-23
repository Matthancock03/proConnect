package views.formData;
import play.data.validation.Constraints;

public class signUpFormData{

  @Constraints.Required
  public String email = "";
  public String password = "";
  public String passwordVerification = "";
  
  public String validate() {
        if (authenticate(email, password, passwordVerification) == null) {
            return "Invalid email or password";
        }
        return null;
    }

}
