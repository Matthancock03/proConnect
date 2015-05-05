
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

        """),_display_(Seq[Any](/*43.10*/if(user.aboutMe != null)/*43.34*/{_display_(Seq[Any](format.raw/*43.35*/("""
          <h3>"""),_display_(Seq[Any](/*44.16*/user/*44.20*/.headline)),format.raw/*44.29*/("""</h3>

        """)))})),format.raw/*46.10*/("""


      """),_display_(Seq[Any](/*49.8*/if(user.currentEmployer != null)/*49.40*/{_display_(Seq[Any](format.raw/*49.41*/("""
          <h3>"""),_display_(Seq[Any](/*50.16*/user/*50.20*/.currentEmployer)),format.raw/*50.36*/("""</h3>
        """)))})),format.raw/*51.10*/("""

      """),_display_(Seq[Any](/*53.8*/if(user.location != null)/*53.33*/{_display_(Seq[Any](format.raw/*53.34*/("""
          <h3>"""),_display_(Seq[Any](/*54.16*/user/*54.20*/.location)),format.raw/*54.29*/("""</h3>
        """)))})),format.raw/*55.10*/("""
    </div>
    <div class="col-xs-2"></div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
      <div class="col-xs-8 column" style="background-color: #FFFFFF;">
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
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
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
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
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

    <div class="col-xs-8 column" style="background-color: #FFFFFF;">

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
                    DATE: Tue May 05 13:54:43 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 4f8cb66a738dad48eee6e9dba8babfa5f3b184f5
                    MATRIX: 783->1|910->17|940->39|979->44|1004->61|1042->62|1079->65|1092->71|1120->78|1187->110|1201->116|1259->153|1407->266|1447->297|1486->298|1580->356|1595->362|1657->401|1688->414|1701->418|1740->419|1848->491|1863->497|1925->536|1972->551|2028->571|2043->577|2092->604|2434->910|2468->935|2507->936|2564->957|2577->961|2608->970|2647->990|2660->994|2699->995|2776->1040|2988->1216|3021->1240|3060->1241|3113->1258|3126->1262|3157->1271|3207->1289|3255->1302|3296->1334|3335->1335|3388->1352|3401->1356|3439->1372|3487->1388|3533->1399|3567->1424|3606->1425|3659->1442|3672->1446|3703->1455|3751->1471|4047->1731|4080->1755|4119->1756|4185->1786|4198->1790|4228->1798|4287->1825|4544->2047|4580->2074|4619->2075|4677->2097|4690->2101|4723->2112|4775->2133|5046->2369|5082->2396|5121->2397|5180->2419|5194->2423|5226->2432|5279->2453|5536->2674|5573->2701|5613->2702|5672->2724|5686->2728|5719->2738|5772->2759|5841->2796
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|62->34|71->43|71->43|71->43|72->44|72->44|72->44|74->46|77->49|77->49|77->49|78->50|78->50|78->50|79->51|81->53|81->53|81->53|82->54|82->54|82->54|83->55|95->67|95->67|95->67|97->69|97->69|97->69|99->71|111->83|111->83|111->83|113->85|113->85|113->85|115->87|126->98|126->98|126->98|128->100|128->100|128->100|130->102|143->115|143->115|143->115|145->117|145->117|145->117|147->119|153->125
                    -- GENERATED --
                */
            