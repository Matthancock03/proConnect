package views.formData;
import play.data.validation.Constraints;
import play.data.*;
// Backing class for user login form.

/**This class handles aspects of the login form and data entered on it.
 * @author Proconnectors
 *
 */
public class loginFormData{

  @Constraints.Required
  public String email = "";
  public String password = "";

  /**Function to validate data entered on the login form.
 * @return an error if required fields are not completed correctly
 */
public String validate() {
        if (email == null || password == null) {
            return "Ensure fields are filled correctly";
        }
        return null;
    }

}
