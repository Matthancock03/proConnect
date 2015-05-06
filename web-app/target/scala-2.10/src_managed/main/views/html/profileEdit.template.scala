
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
    <div class="col-md-4 column img-div">
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
    <div class="col-xs-7 column">
      <h2>
        
      </h2>
      
      <p>
        
      </p>
      
    </div>
    </div>


  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
      <div class="col-xs-7 column" style="background-color: #FFFFFF;">
        <h2>
          About Me
        </h2>
        """),_display_(Seq[Any](/*81.10*/if(user.aboutMe != null)/*81.34*/{_display_(Seq[Any](format.raw/*81.35*/("""
          <p>
            """),_display_(Seq[Any](/*83.14*/user/*83.18*/.aboutMe)),format.raw/*83.26*/("""
          </p>
        """)))})),format.raw/*85.10*/("""

      </div>
  </div>

  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-7 column" style="background-color: #FFFFFF;">
      <h2>
        Experience
      </h2>
      """),_display_(Seq[Any](/*98.8*/if(user.experience != null)/*98.35*/{_display_(Seq[Any](format.raw/*98.36*/("""
      <p>
        """),_display_(Seq[Any](/*100.10*/user/*100.14*/.experience)),format.raw/*100.25*/("""
      </p>
      """)))})),format.raw/*102.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-7 column" style="background-color: #FFFFFF;">
      <h2>
        Projects or Skills Highlight
      </h2>
      """),_display_(Seq[Any](/*113.8*/if(user.experience != null)/*113.35*/{_display_(Seq[Any](format.raw/*113.36*/("""
      <p>
        """),_display_(Seq[Any](/*115.10*/user/*115.14*/.projects)),format.raw/*115.23*/("""
      </p>
      """)))})),format.raw/*117.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>

    <div class="col-xs-7 column" style="background-color: #FFFFFF;">

      <h2>
        Education
      </h2>
      """),_display_(Seq[Any](/*130.8*/if(user.experience != null)/*130.35*/{_display_(Seq[Any](format.raw/*130.36*/("""
      <p>
        """),_display_(Seq[Any](/*132.10*/user/*132.14*/.education)),format.raw/*132.24*/("""
      </p>
      """)))})),format.raw/*134.8*/("""
    </div>
  </div>


</div>
""")))})),format.raw/*140.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 05 19:02:47 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: e3467606bf75961c9e4f1bc1e5edbde364a6eee6
                    MATRIX: 783->1|910->17|940->39|979->44|1004->61|1042->62|1079->65|1092->71|1120->78|1187->110|1201->116|1259->153|1407->266|1447->297|1486->298|1580->356|1595->362|1657->401|1688->414|1701->418|1740->419|1848->491|1863->497|1925->536|1972->551|2028->571|2043->577|2092->604|2434->910|2468->935|2507->936|2564->957|2577->961|2608->970|2647->990|2660->994|2699->995|2776->1040|3002->1230|3035->1254|3074->1255|3127->1272|3140->1276|3171->1285|3221->1303|3269->1316|3310->1348|3349->1349|3402->1366|3415->1370|3453->1386|3501->1402|3547->1413|3581->1438|3620->1439|3673->1456|3686->1460|3717->1469|3765->1485|4198->1882|4231->1906|4270->1907|4336->1937|4349->1941|4379->1949|4438->1976|4697->2200|4733->2227|4772->2228|4831->2250|4845->2254|4879->2265|4932->2286|5204->2522|5241->2549|5281->2550|5340->2572|5354->2576|5386->2585|5439->2606|5696->2827|5733->2854|5773->2855|5832->2877|5846->2881|5879->2891|5932->2912|6001->2949
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|62->34|72->44|72->44|72->44|73->45|73->45|73->45|75->47|78->50|78->50|78->50|79->51|79->51|79->51|80->52|82->54|82->54|82->54|83->55|83->55|83->55|84->56|109->81|109->81|109->81|111->83|111->83|111->83|113->85|126->98|126->98|126->98|128->100|128->100|128->100|130->102|141->113|141->113|141->113|143->115|143->115|143->115|145->117|158->130|158->130|158->130|160->132|160->132|160->132|162->134|168->140
                    -- GENERATED --
                */
            