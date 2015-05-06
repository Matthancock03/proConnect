
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
                    DATE: Wed May 06 16:41:47 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 02e2acef42f3d4177160ea7d9a130c13460e3a85
                    MATRIX: 783->1|910->17|940->39|979->44|1004->61|1042->62|1079->65|1092->71|1120->78|1187->110|1201->116|1259->153|1407->266|1447->297|1486->298|1580->356|1595->362|1657->401|1688->414|1701->418|1740->419|1848->491|1863->497|1925->536|1972->551|2028->571|2043->577|2092->604|2452->928|2486->953|2525->954|2599->992|2612->996|2643->1005|2682->1025|2695->1029|2734->1030|2811->1075|2870->1098|2904->1123|2943->1124|3043->1188|3056->1192|3087->1201|3138->1220|3191->1237|3232->1269|3271->1270|3346->1309|3359->1313|3397->1329|3448->1348|3501->1365|3539->1394|3578->1395|3653->1434|3666->1438|3701->1451|3752->1470|3805->1487|3839->1512|3878->1513|3951->1550|3964->1554|3995->1563|4046->1582|4255->1755|4288->1779|4327->1780|4393->1810|4406->1814|4436->1822|4495->1849|4593->1912|4629->1939|4668->1940|4726->1962|4739->1966|4772->1977|4824->1998|4940->2079|4976->2106|5015->2107|5073->2129|5086->2133|5117->2142|5169->2163|5266->2225|5302->2252|5341->2253|5399->2275|5412->2279|5444->2289|5496->2310|5570->2353
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|63->35|65->37|65->37|65->37|66->38|66->38|66->38|67->39|69->41|69->41|69->41|70->42|70->42|70->42|71->43|73->45|73->45|73->45|74->46|74->46|74->46|75->47|77->49|77->49|77->49|78->50|78->50|78->50|79->51|86->58|86->58|86->58|88->60|88->60|88->60|90->62|95->67|95->67|95->67|97->69|97->69|97->69|99->71|104->76|104->76|104->76|106->78|106->78|106->78|108->80|113->85|113->85|113->85|115->87|115->87|115->87|117->89|122->94
                    -- GENERATED --
                */
            