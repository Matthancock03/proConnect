package views.formData;
import play.data.validation.Constraints;
import play.data.validation.*;
import play.data.*;

public class signUpFormData{

  @Constraints.Required
  public String email = "";
  public String password = "";
  public String passwordVerification = "";

  public String validate() {
        if (email == null || password == null || passwordVerification == null) {
            return "Ensure fields are filled correctly";
        }
        return null;
    }

}
