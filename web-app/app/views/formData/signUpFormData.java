package views.formData;
import play.data.validation.Constraints;
import play.data.validation.*;
import play.data.*;

/**This class handles aspects of the sign up form and data entered on it.
 * @author Proconnectors
 *
 */
public class signUpFormData{

  @Constraints.Required
  public String email = "";
  public String password = "";
  public String passwordVerification = "";

  /**Function to validate data entered on the sign up form.
 * @return an error if required fields are not entered correctly
 */
public String validate() {
        if (email == null || password == null || passwordVerification == null) {
            return "Ensure fields are filled correctly";
        }
        return null;
    }

}
