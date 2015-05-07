
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


<br />
        <div class="col-xs-6 column">
          <div class="centerDiv" style="background-color: #FFFFFF;">
           """),_display_(Seq[Any](/*31.13*/if(user.userName != null)/*31.38*/{_display_(Seq[Any](format.raw/*31.39*/("""
              <h4 class="nameText">"""),_display_(Seq[Any](/*32.37*/user/*32.41*/.userName)),format.raw/*32.50*/("""</h4>
            """)))}/*33.14*/else/*33.18*/{_display_(Seq[Any](format.raw/*33.19*/("""
              <h4>Guest</h4>
            """)))})),format.raw/*35.14*/("""
<br />
            """),_display_(Seq[Any](/*37.14*/if(user.location != null)/*37.39*/{_display_(Seq[Any](format.raw/*37.40*/("""
                <p class="headText"syle="margin-top: -10px;">"""),_display_(Seq[Any](/*38.63*/user/*38.67*/.location)),format.raw/*38.76*/("""</p>
            """)))})),format.raw/*39.14*/("""

            """),_display_(Seq[Any](/*41.14*/if(user.currentEmployer != null)/*41.46*/{_display_(Seq[Any](format.raw/*41.47*/("""
                <p class="headText">"""),_display_(Seq[Any](/*42.38*/user/*42.42*/.currentEmployer)),format.raw/*42.58*/("""</p>
            """)))})),format.raw/*43.14*/("""

            """),_display_(Seq[Any](/*45.14*/if(user.recentSchool != null)/*45.43*/{_display_(Seq[Any](format.raw/*45.44*/("""
                <p class="headText">"""),_display_(Seq[Any](/*46.38*/user/*46.42*/.recentSchool)),format.raw/*46.55*/("""</p>
            """)))})),format.raw/*47.14*/("""

            """),_display_(Seq[Any](/*49.14*/if(user.headline != null)/*49.39*/{_display_(Seq[Any](format.raw/*49.40*/("""
              <p class="headText">"""),_display_(Seq[Any](/*50.36*/user/*50.40*/.headline)),format.raw/*50.49*/("""</p>
            """)))})),format.raw/*51.14*/("""
          </div>
          <br /><br /><br />
    <div class="centerDiv" style="background-color: #FFFFFF;">
        <h2>
          About Me:
        </h2>
        """),_display_(Seq[Any](/*58.10*/if(user.aboutMe != null)/*58.34*/{_display_(Seq[Any](format.raw/*58.35*/("""
          <p>
            """),_display_(Seq[Any](/*60.14*/user/*60.18*/.aboutMe)),format.raw/*60.26*/("""
          </p>
        """)))})),format.raw/*62.10*/("""
<br />
      <h2>
        Experience:
      </h2>
      """),_display_(Seq[Any](/*67.8*/if(user.experience != null)/*67.35*/{_display_(Seq[Any](format.raw/*67.36*/("""
      <p>
        """),_display_(Seq[Any](/*69.10*/user/*69.14*/.experience)),format.raw/*69.25*/("""
      </p>
      """)))})),format.raw/*71.8*/("""
<br />
      <h2>
        Projects or Skills Highlight:
      </h2>
      """),_display_(Seq[Any](/*76.8*/if(user.experience != null)/*76.35*/{_display_(Seq[Any](format.raw/*76.36*/("""
      <p>
        """),_display_(Seq[Any](/*78.10*/user/*78.14*/.projects)),format.raw/*78.23*/("""
      </p>
      """)))})),format.raw/*80.8*/("""
<br />
      <h2>
        Education:
      </h2>
      """),_display_(Seq[Any](/*85.8*/if(user.experience != null)/*85.35*/{_display_(Seq[Any](format.raw/*85.36*/("""
      <p>
        """),_display_(Seq[Any](/*87.10*/user/*87.14*/.education)),format.raw/*87.24*/("""
      </p>
      """)))})),format.raw/*89.8*/("""
    </div>
    </div>
</div>
</div>
""")))})),format.raw/*94.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 19:01:47 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 0e70d705371d2ba56532492e1d08194108aa1e49
                    MATRIX: 783->1|909->17|937->36|974->39|999->56|1037->57|1073->59|1086->65|1114->72|1180->103|1194->109|1252->146|1394->253|1434->284|1473->285|1566->342|1581->348|1643->387|1673->399|1686->403|1725->404|1832->475|1847->481|1909->520|1955->534|2010->553|2025->559|2074->586|2422->898|2456->923|2495->924|2568->961|2581->965|2612->974|2650->993|2663->997|2702->998|2777->1041|2834->1062|2868->1087|2907->1088|3006->1151|3019->1155|3050->1164|3100->1182|3151->1197|3192->1229|3231->1230|3305->1268|3318->1272|3356->1288|3406->1306|3457->1321|3495->1350|3534->1351|3608->1389|3621->1393|3656->1406|3706->1424|3757->1439|3791->1464|3830->1465|3902->1501|3915->1505|3946->1514|3996->1532|4198->1698|4231->1722|4270->1723|4334->1751|4347->1755|4377->1763|4434->1788|4527->1846|4563->1873|4602->1874|4658->1894|4671->1898|4704->1909|4754->1928|4865->2004|4901->2031|4940->2032|4996->2052|5009->2056|5040->2065|5090->2084|5182->2141|5218->2168|5257->2169|5313->2189|5326->2193|5358->2203|5408->2222|5477->2260
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|63->35|65->37|65->37|65->37|66->38|66->38|66->38|67->39|69->41|69->41|69->41|70->42|70->42|70->42|71->43|73->45|73->45|73->45|74->46|74->46|74->46|75->47|77->49|77->49|77->49|78->50|78->50|78->50|79->51|86->58|86->58|86->58|88->60|88->60|88->60|90->62|95->67|95->67|95->67|97->69|97->69|97->69|99->71|104->76|104->76|104->76|106->78|106->78|106->78|108->80|113->85|113->85|113->85|115->87|115->87|115->87|117->89|122->94
                    -- GENERATED --
                */
            