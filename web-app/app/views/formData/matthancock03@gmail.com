package views.formData;
import play.data.validation.Constraints;
// Backing class for user login form.

public class loginFormData{

  @Constraints.Required
  public String email = "";
  public String password = "";
  
  public String validate() {
        if (authenticate(email, password) == null) {
            return "Invalid email or password";
        }
        return null;
    }

}
