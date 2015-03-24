package views.formData;
import play.data.validation.Constraints;
import play.data.*;
// Backing class for user login form.

public class loginFormData{

  @Constraints.Required
  public String email = "";
  public String password = "";

  public String validate() {
        if (email == null || password == null) {
            return "Ensure fields are filled correctly";
        }
        return null;
    }

}
