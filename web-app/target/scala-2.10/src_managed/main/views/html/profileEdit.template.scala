
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
                    DATE: Wed May 06 12:46:29 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: e6688f7ecc3fa9319e17f9360bebade289ac3e42
                    MATRIX: 783->1|910->17|940->39|979->44|1004->61|1042->62|1079->65|1092->71|1120->78|1187->110|1201->116|1259->153|1407->266|1447->297|1486->298|1580->356|1595->362|1657->401|1688->414|1701->418|1740->419|1848->491|1863->497|1925->536|1972->551|2028->571|2043->577|2092->604|2444->920|2478->945|2517->946|2591->984|2604->988|2635->997|2674->1017|2687->1021|2726->1022|2803->1067|2856->1084|2890->1109|2929->1110|3029->1174|3042->1178|3073->1187|3124->1206|3177->1223|3218->1255|3257->1256|3332->1295|3345->1299|3383->1315|3434->1334|3487->1351|3525->1380|3564->1381|3639->1420|3652->1424|3687->1437|3738->1456|3791->1473|3825->1498|3864->1499|3937->1536|3950->1540|3981->1549|4032->1568|4193->1693|4226->1717|4265->1718|4331->1748|4344->1752|4374->1760|4433->1787|4525->1844|4561->1871|4600->1872|4658->1894|4671->1898|4704->1909|4756->1930|4866->2005|4902->2032|4941->2033|4999->2055|5012->2059|5043->2068|5095->2089|5186->2145|5222->2172|5261->2173|5319->2195|5332->2199|5364->2209|5416->2230|5490->2273
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|62->34|64->36|64->36|64->36|65->37|65->37|65->37|66->38|68->40|68->40|68->40|69->41|69->41|69->41|70->42|72->44|72->44|72->44|73->45|73->45|73->45|74->46|76->48|76->48|76->48|77->49|77->49|77->49|78->50|84->56|84->56|84->56|86->58|86->58|86->58|88->60|93->65|93->65|93->65|95->67|95->67|95->67|97->69|102->74|102->74|102->74|104->76|104->76|104->76|106->78|111->83|111->83|111->83|113->85|113->85|113->85|115->87|120->92
                    -- GENERATED --
                */
            