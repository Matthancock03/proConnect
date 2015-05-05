package models;

import play.data.validation.Constraints;
import play.data.*;
import securesocial.core.java.SecureSocial;
import scala.Option;
import securesocial.core.Identity;
import securesocial.core.IdentityId;
import securesocial.core.java.BaseUserService;
import java.util.*;
import java.io.*;
import java.sql.*;
import play.db.*;
import java.util.*;
import javax.persistence.*;
import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.db.ebean.Model.Finder;
import play.Logger;

@Entity
public class Job extends Model  {

  @Id
  public Long jobId;
  public Long posterId;
  public String postTitle;
  public String jobTitle;
  public String jobDescription;
  public String companyName;
  public boolean isRead;
  Timestamp tstamp;

}
