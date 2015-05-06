
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
          <br />
    <div class="centerDiv" style="background-color: #FFFFFF;">
        <h2>
          About Me:
        </h2>
        """),_display_(Seq[Any](/*57.10*/if(user.aboutMe != null)/*57.34*/{_display_(Seq[Any](format.raw/*57.35*/("""
          <p>
            """),_display_(Seq[Any](/*59.14*/user/*59.18*/.aboutMe)),format.raw/*59.26*/("""
          </p>
        """)))})),format.raw/*61.10*/("""
<br />
      <h2>
        Experience:
      </h2>
      """),_display_(Seq[Any](/*66.8*/if(user.experience != null)/*66.35*/{_display_(Seq[Any](format.raw/*66.36*/("""
      <p>
        """),_display_(Seq[Any](/*68.10*/user/*68.14*/.experience)),format.raw/*68.25*/("""
      </p>
      """)))})),format.raw/*70.8*/("""
<br />
      <h2>
        Projects or Skills Highlight:
      </h2>
      """),_display_(Seq[Any](/*75.8*/if(user.experience != null)/*75.35*/{_display_(Seq[Any](format.raw/*75.36*/("""
      <p>
        """),_display_(Seq[Any](/*77.10*/user/*77.14*/.projects)),format.raw/*77.23*/("""
      </p>
      """)))})),format.raw/*79.8*/("""
<br />
      <h2>
        Education:
      </h2>
      """),_display_(Seq[Any](/*84.8*/if(user.experience != null)/*84.35*/{_display_(Seq[Any](format.raw/*84.36*/("""
      <p>
        """),_display_(Seq[Any](/*86.10*/user/*86.14*/.education)),format.raw/*86.24*/("""
      </p>
      """)))})),format.raw/*88.8*/("""
    </div>
    </div>
</div>
</div>
""")))})),format.raw/*93.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 13:40:52 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 95919663322fc5e15508400bd39b4fa5e901c387
                    MATRIX: 783->1|910->17|940->39|979->44|1004->61|1042->62|1079->65|1092->71|1120->78|1187->110|1201->116|1259->153|1407->266|1447->297|1486->298|1580->356|1595->362|1657->401|1688->414|1701->418|1740->419|1848->491|1863->497|1925->536|1972->551|2028->571|2043->577|2092->604|2450->926|2484->951|2523->952|2597->990|2610->994|2641->1003|2680->1023|2693->1027|2732->1028|2809->1073|2862->1090|2896->1115|2935->1116|3035->1180|3048->1184|3079->1193|3130->1212|3183->1229|3224->1261|3263->1262|3338->1301|3351->1305|3389->1321|3440->1340|3493->1357|3531->1386|3570->1387|3645->1426|3658->1430|3693->1443|3744->1462|3797->1479|3831->1504|3870->1505|3943->1542|3956->1546|3987->1555|4038->1574|4235->1735|4268->1759|4307->1760|4373->1790|4386->1794|4416->1802|4475->1829|4573->1892|4609->1919|4648->1920|4706->1942|4719->1946|4752->1957|4804->1978|4920->2059|4956->2086|4995->2087|5053->2109|5066->2113|5097->2122|5149->2143|5246->2205|5282->2232|5321->2233|5379->2255|5392->2259|5424->2269|5476->2290|5550->2333
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|62->34|64->36|64->36|64->36|65->37|65->37|65->37|66->38|68->40|68->40|68->40|69->41|69->41|69->41|70->42|72->44|72->44|72->44|73->45|73->45|73->45|74->46|76->48|76->48|76->48|77->49|77->49|77->49|78->50|85->57|85->57|85->57|87->59|87->59|87->59|89->61|94->66|94->66|94->66|96->68|96->68|96->68|98->70|103->75|103->75|103->75|105->77|105->77|105->77|107->79|112->84|112->84|112->84|114->86|114->86|114->86|116->88|121->93
                    -- GENERATED --
                */
            