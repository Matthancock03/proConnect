
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


        <div class="col-xs-6 column">
          <div class="centerDiv" style="background-color: #FFFFFF;">
           """),_display_(Seq[Any](/*30.13*/if(user.userName != null)/*30.38*/{_display_(Seq[Any](format.raw/*30.39*/("""
              <h4 class="nameText">"""),_display_(Seq[Any](/*31.37*/user/*31.41*/.userName)),format.raw/*31.50*/("""</h4>
            """)))}/*32.14*/else/*32.18*/{_display_(Seq[Any](format.raw/*32.19*/("""
              <h4>Guest</h4>
            """)))})),format.raw/*34.14*/("""

            """),_display_(Seq[Any](/*36.14*/if(user.location != null)/*36.39*/{_display_(Seq[Any](format.raw/*36.40*/("""
                <p class="headText"syle="margin-top: -10px;">"""),_display_(Seq[Any](/*37.63*/user/*37.67*/.location)),format.raw/*37.76*/("""</p>
            """)))})),format.raw/*38.14*/("""

            """),_display_(Seq[Any](/*40.14*/if(user.currentEmployer != null)/*40.46*/{_display_(Seq[Any](format.raw/*40.47*/("""
                <p class="headText">"""),_display_(Seq[Any](/*41.38*/user/*41.42*/.currentEmployer)),format.raw/*41.58*/("""</p>
            """)))})),format.raw/*42.14*/("""

            """),_display_(Seq[Any](/*44.14*/if(user.recentSchool != null)/*44.43*/{_display_(Seq[Any](format.raw/*44.44*/("""
                <p class="headText">"""),_display_(Seq[Any](/*45.38*/user/*45.42*/.recentSchool)),format.raw/*45.55*/("""</p>
            """)))})),format.raw/*46.14*/("""

            """),_display_(Seq[Any](/*48.14*/if(user.headline != null)/*48.39*/{_display_(Seq[Any](format.raw/*48.40*/("""
              <p class="headText">"""),_display_(Seq[Any](/*49.36*/user/*49.40*/.headline)),format.raw/*49.49*/("""</p>
            """)))})),format.raw/*50.14*/("""
          </div>
    <div style="background-color: #FFFFFF;">
        <h2>
          About Me:
        </h2>
        """),_display_(Seq[Any](/*56.10*/if(user.aboutMe != null)/*56.34*/{_display_(Seq[Any](format.raw/*56.35*/("""
          <p>
            """),_display_(Seq[Any](/*58.14*/user/*58.18*/.aboutMe)),format.raw/*58.26*/("""
          </p>
        """)))})),format.raw/*60.10*/("""

      <h2>
        Experience:
      </h2>
      """),_display_(Seq[Any](/*65.8*/if(user.experience != null)/*65.35*/{_display_(Seq[Any](format.raw/*65.36*/("""
      <p>
        """),_display_(Seq[Any](/*67.10*/user/*67.14*/.experience)),format.raw/*67.25*/("""
      </p>
      """)))})),format.raw/*69.8*/("""

      <h2>
        Projects or Skills Highlight:
      </h2>
      """),_display_(Seq[Any](/*74.8*/if(user.experience != null)/*74.35*/{_display_(Seq[Any](format.raw/*74.36*/("""
      <p>
        """),_display_(Seq[Any](/*76.10*/user/*76.14*/.projects)),format.raw/*76.23*/("""
      </p>
      """)))})),format.raw/*78.8*/("""

      <h2>
        Education:
      </h2>
      """),_display_(Seq[Any](/*83.8*/if(user.experience != null)/*83.35*/{_display_(Seq[Any](format.raw/*83.36*/("""
      <p>
        """),_display_(Seq[Any](/*85.10*/user/*85.14*/.education)),format.raw/*85.24*/("""
      </p>
      """)))})),format.raw/*87.8*/("""
    </div>
    </div>
</div>
</div>
""")))})),format.raw/*92.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 05 22:09:46 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 28170605877de74b0b3f3895fbc46e3bfaa5e1f4
                    MATRIX: 783->1|909->17|937->36|974->39|999->56|1037->57|1073->59|1086->65|1114->72|1180->103|1194->109|1252->146|1394->253|1434->284|1473->285|1566->342|1581->348|1643->387|1673->399|1686->403|1725->404|1832->475|1847->481|1909->520|1955->534|2010->553|2025->559|2074->586|2415->891|2449->916|2488->917|2561->954|2574->958|2605->967|2643->986|2656->990|2695->991|2770->1034|2821->1049|2855->1074|2894->1075|2993->1138|3006->1142|3037->1151|3087->1169|3138->1184|3179->1216|3218->1217|3292->1255|3305->1259|3343->1275|3393->1293|3444->1308|3482->1337|3521->1338|3595->1376|3608->1380|3643->1393|3693->1411|3744->1426|3778->1451|3817->1452|3889->1488|3902->1492|3933->1501|3983->1519|4138->1638|4171->1662|4210->1663|4274->1691|4287->1695|4317->1703|4374->1728|4461->1780|4497->1807|4536->1808|4592->1828|4605->1832|4638->1843|4688->1862|4793->1932|4829->1959|4868->1960|4924->1980|4937->1984|4968->1993|5018->2012|5104->2063|5140->2090|5179->2091|5235->2111|5248->2115|5280->2125|5330->2144|5399->2182
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|62->34|64->36|64->36|64->36|65->37|65->37|65->37|66->38|68->40|68->40|68->40|69->41|69->41|69->41|70->42|72->44|72->44|72->44|73->45|73->45|73->45|74->46|76->48|76->48|76->48|77->49|77->49|77->49|78->50|84->56|84->56|84->56|86->58|86->58|86->58|88->60|93->65|93->65|93->65|95->67|95->67|95->67|97->69|102->74|102->74|102->74|104->76|104->76|104->76|106->78|111->83|111->83|111->83|113->85|113->85|113->85|115->87|120->92
                    -- GENERATED --
                */
            