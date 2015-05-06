
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object profileEdit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[UserModel,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:UserModel):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("ProConect")/*6.19*/{_display_(Seq[Any](format.raw/*6.20*/("""
"""),_display_(Seq[Any](/*7.2*/navbar/*7.8*/.render)),format.raw/*7.15*/("""
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*8.31*/routes/*8.37*/.Assets.at("stylesheets/profile.css"))),format.raw/*8.74*/("""">


<div class="container">
  <div class="row clearfix">
    <div class="col-md-3 column img-div">
      """),_display_(Seq[Any](/*14.8*/if(user.profilePicture != null)/*14.39*/{_display_(Seq[Any](format.raw/*14.40*/("""
        <img class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*15.57*/routes/*15.63*/.DbController.getProfilePic(user.email))),format.raw/*15.102*/("""" />
      """)))}/*16.8*/else/*16.12*/{_display_(Seq[Any](format.raw/*16.13*/("""
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.71*/routes/*17.77*/.Assets.at("images/profile_holder.png"))),format.raw/*17.116*/("""" />
        """)))})),format.raw/*18.10*/("""
        <a href=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.DbController.profileMain())),format.raw/*19.52*/("""">
          <div>
          <br />
          <button type="button" class="btn btn-success edit-button" name="editButton">Edit Profile</button>
        </div>
     </a>
        </div>


<br /><br /><br />
        <div class="col-md-5 column img-div" style="background-color: #FFFFFF;">
        """),_display_(Seq[Any](/*30.10*/if(user.userName != null)/*30.35*/{_display_(Seq[Any](format.raw/*30.36*/("""
              <h4>"""),_display_(Seq[Any](/*31.20*/user/*31.24*/.userName)),format.raw/*31.33*/("""</h4>
            """)))}/*32.14*/else/*32.18*/{_display_(Seq[Any](format.raw/*32.19*/("""
              <h4>Guest</h4>
            """)))})),format.raw/*34.14*/("""
            
            </div>
      

    </div>
    <div class="col-md-3 column img-div"></div>

    <div class="col-md-5 column" style="background-color: #FFFFFF;">

        """),_display_(Seq[Any](/*44.10*/if(user.aboutMe != null)/*44.34*/{_display_(Seq[Any](format.raw/*44.35*/("""
          <h3>"""),_display_(Seq[Any](/*45.16*/user/*45.20*/.headline)),format.raw/*45.29*/("""</h3>

        """)))})),format.raw/*47.10*/("""


      """),_display_(Seq[Any](/*50.8*/if(user.currentEmployer != null)/*50.40*/{_display_(Seq[Any](format.raw/*50.41*/("""
          <h3>"""),_display_(Seq[Any](/*51.16*/user/*51.20*/.currentEmployer)),format.raw/*51.36*/("""</h3>
        """)))})),format.raw/*52.10*/("""

      """),_display_(Seq[Any](/*54.8*/if(user.location != null)/*54.33*/{_display_(Seq[Any](format.raw/*54.34*/("""
          <h3>"""),_display_(Seq[Any](/*55.16*/user/*55.20*/.location)),format.raw/*55.29*/("""</h3>
        """)))})),format.raw/*56.10*/("""
    </div>
    
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
      <div class="col-xs-7 column" style="background-color: #FFFFFF;">
        <h2>
          About Me
        </h2>
        """),_display_(Seq[Any](/*67.10*/if(user.aboutMe != null)/*67.34*/{_display_(Seq[Any](format.raw/*67.35*/("""
          <p>
            """),_display_(Seq[Any](/*69.14*/user/*69.18*/.aboutMe)),format.raw/*69.26*/("""
          </p>
        """)))})),format.raw/*71.10*/("""

      </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-7 column" style="background-color: #FFFFFF;">
      <h2>
        Experience
      </h2>
      """),_display_(Seq[Any](/*83.8*/if(user.experience != null)/*83.35*/{_display_(Seq[Any](format.raw/*83.36*/("""
      <p>
        """),_display_(Seq[Any](/*85.10*/user/*85.14*/.experience)),format.raw/*85.25*/("""
      </p>
      """)))})),format.raw/*87.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-7 column" style="background-color: #FFFFFF;">
      <h2>
        Projects or Skills Highlight
      </h2>
      """),_display_(Seq[Any](/*98.8*/if(user.experience != null)/*98.35*/{_display_(Seq[Any](format.raw/*98.36*/("""
      <p>
        """),_display_(Seq[Any](/*100.10*/user/*100.14*/.projects)),format.raw/*100.23*/("""
      </p>
      """)))})),format.raw/*102.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>

    <div class="col-xs-7 column" style="background-color: #FFFFFF;">

      <h2>
        Education
      </h2>
      """),_display_(Seq[Any](/*115.8*/if(user.experience != null)/*115.35*/{_display_(Seq[Any](format.raw/*115.36*/("""
      <p>
        """),_display_(Seq[Any](/*117.10*/user/*117.14*/.education)),format.raw/*117.24*/("""
      </p>
      """)))})),format.raw/*119.8*/("""
    </div>
  </div>


</div>
""")))})),format.raw/*125.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 05 17:43:17 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: fd586c2f9b1b360bf6029f5e8cfd49d76b6402bb
                    MATRIX: 783->1|910->17|940->39|979->44|1004->61|1042->62|1079->65|1092->71|1120->78|1187->110|1201->116|1259->153|1407->266|1447->297|1486->298|1580->356|1595->362|1657->401|1688->414|1701->418|1740->419|1848->491|1863->497|1925->536|1972->551|2028->571|2043->577|2092->604|2434->910|2468->935|2507->936|2564->957|2577->961|2608->970|2647->990|2660->994|2699->995|2776->1040|3002->1230|3035->1254|3074->1255|3127->1272|3140->1276|3171->1285|3221->1303|3269->1316|3310->1348|3349->1349|3402->1366|3415->1370|3453->1386|3501->1402|3547->1413|3581->1438|3620->1439|3673->1456|3686->1460|3717->1469|3765->1485|4023->1707|4056->1731|4095->1732|4161->1762|4174->1766|4204->1774|4263->1801|4520->2023|4556->2050|4595->2051|4653->2073|4666->2077|4699->2088|4751->2109|5022->2345|5058->2372|5097->2373|5156->2395|5170->2399|5202->2408|5255->2429|5512->2650|5549->2677|5589->2678|5648->2700|5662->2704|5695->2714|5748->2735|5817->2772
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|62->34|72->44|72->44|72->44|73->45|73->45|73->45|75->47|78->50|78->50|78->50|79->51|79->51|79->51|80->52|82->54|82->54|82->54|83->55|83->55|83->55|84->56|95->67|95->67|95->67|97->69|97->69|97->69|99->71|111->83|111->83|111->83|113->85|113->85|113->85|115->87|126->98|126->98|126->98|128->100|128->100|128->100|130->102|143->115|143->115|143->115|145->117|145->117|145->117|147->119|153->125
                    -- GENERATED --
                */
            