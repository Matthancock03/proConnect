
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
<br />
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
          <br /><br /><br />
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
                    DATE: Wed May 06 15:18:48 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 04e8ed9869e285b4ac700ffdd5d3cf8b5e2ee49b
                    MATRIX: 783->1|910->17|940->39|979->44|1004->61|1042->62|1079->65|1092->71|1120->78|1187->110|1201->116|1259->153|1407->266|1447->297|1486->298|1580->356|1595->362|1657->401|1688->414|1701->418|1740->419|1848->491|1863->497|1925->536|1972->551|2028->571|2043->577|2092->604|2450->926|2484->951|2523->952|2597->990|2610->994|2641->1003|2680->1023|2693->1027|2732->1028|2809->1073|2868->1096|2902->1121|2941->1122|3041->1186|3054->1190|3085->1199|3136->1218|3189->1235|3230->1267|3269->1268|3344->1307|3357->1311|3395->1327|3446->1346|3499->1363|3537->1392|3576->1393|3651->1432|3664->1436|3699->1449|3750->1468|3803->1485|3837->1510|3876->1511|3949->1548|3962->1552|3993->1561|4044->1580|4253->1753|4286->1777|4325->1778|4391->1808|4404->1812|4434->1820|4493->1847|4591->1910|4627->1937|4666->1938|4724->1960|4737->1964|4770->1975|4822->1996|4938->2077|4974->2104|5013->2105|5071->2127|5084->2131|5115->2140|5167->2161|5264->2223|5300->2250|5339->2251|5397->2273|5410->2277|5442->2287|5494->2308|5568->2351
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|62->34|64->36|64->36|64->36|65->37|65->37|65->37|66->38|68->40|68->40|68->40|69->41|69->41|69->41|70->42|72->44|72->44|72->44|73->45|73->45|73->45|74->46|76->48|76->48|76->48|77->49|77->49|77->49|78->50|85->57|85->57|85->57|87->59|87->59|87->59|89->61|94->66|94->66|94->66|96->68|96->68|96->68|98->70|103->75|103->75|103->75|105->77|105->77|105->77|107->79|112->84|112->84|112->84|114->86|114->86|114->86|116->88|121->93
                    -- GENERATED --
                */
            