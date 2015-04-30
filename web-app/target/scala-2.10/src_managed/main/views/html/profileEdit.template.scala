
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
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*5.31*/routes/*5.37*/.Assets.at("stylesheets/profile.min.css"))),format.raw/*5.78*/("""">

"""),_display_(Seq[Any](/*7.2*/main("ProConect")/*7.19*/{_display_(Seq[Any](format.raw/*7.20*/("""
"""),_display_(Seq[Any](/*8.2*/navbar/*8.8*/.render)),format.raw/*8.15*/("""


<div class="container">
  <div class="row clearfix">
    <div class="col-md-2 column img-div">
      """),_display_(Seq[Any](/*14.8*/if(user.profilePicture != null)/*14.39*/{_display_(Seq[Any](format.raw/*14.40*/("""

        """)))}/*16.10*/else/*16.14*/{_display_(Seq[Any](format.raw/*16.15*/("""
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.71*/routes/*17.77*/.Assets.at("images/profile_holder.png"))),format.raw/*17.116*/("""" />
        """)))})),format.raw/*18.10*/("""
        """),_display_(Seq[Any](/*19.10*/if(user.userName != null)/*19.35*/{_display_(Seq[Any](format.raw/*19.36*/("""
              <h4>"""),_display_(Seq[Any](/*20.20*/user/*20.24*/.userName)),format.raw/*20.33*/("""</h4>
            """)))}/*21.14*/else/*21.18*/{_display_(Seq[Any](format.raw/*21.19*/("""
              <h4>Guest</h4>
            """)))})),format.raw/*23.14*/("""
        <a href=""""),_display_(Seq[Any](/*24.19*/routes/*24.25*/.DbController.profileMain())),format.raw/*24.52*/("""">
      <button type="button" class="btn btn-default edit-button">Edit Profile</button>
    </a>
    </div>
    <div class="col-xs-2"></div>

    <div class="col-md-6 column">
        """),_display_(Seq[Any](/*31.10*/if(user.aboutMe != null)/*31.34*/{_display_(Seq[Any](format.raw/*31.35*/("""
          <h3>"""),_display_(Seq[Any](/*32.16*/user/*32.20*/.aboutMe)),format.raw/*32.28*/("""</h3>
        """)))})),format.raw/*33.10*/("""

      """),_display_(Seq[Any](/*35.8*/if(user.currentEmployer != null)/*35.40*/{_display_(Seq[Any](format.raw/*35.41*/("""
          <h3>"""),_display_(Seq[Any](/*36.16*/user/*36.20*/.currentEmployer)),format.raw/*36.36*/("""</h3>
        """)))})),format.raw/*37.10*/("""

      """),_display_(Seq[Any](/*39.8*/if(user.location != null)/*39.33*/{_display_(Seq[Any](format.raw/*39.34*/("""
          <h3>"""),_display_(Seq[Any](/*40.16*/user/*40.20*/.location)),format.raw/*40.29*/("""</h3>
        """)))})),format.raw/*41.10*/("""
    </div>
    <div class="col-xs-2"></div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
      <div class="col-xs-8 column">
        <h2>
          About Me
        </h2>
        """),_display_(Seq[Any](/*53.10*/if(user.aboutMe != null)/*53.34*/{_display_(Seq[Any](format.raw/*53.35*/("""
          <p>
            """),_display_(Seq[Any](/*55.14*/user/*55.18*/.aboutMe)),format.raw/*55.26*/("""
          </p>
        """)))})),format.raw/*57.10*/("""

      </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column">
      <h2>
        Experience
      </h2>
      """),_display_(Seq[Any](/*69.8*/if(user.experience != null)/*69.35*/{_display_(Seq[Any](format.raw/*69.36*/("""
      <p>
        """),_display_(Seq[Any](/*71.10*/user/*71.14*/.experience)),format.raw/*71.25*/("""
      </p>
      """)))})),format.raw/*73.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column">
      <h2>
        Projects or Skills Highlight
      </h2>
      """),_display_(Seq[Any](/*84.8*/if(user.experience != null)/*84.35*/{_display_(Seq[Any](format.raw/*84.36*/("""
      <p>
        """),_display_(Seq[Any](/*86.10*/user/*86.14*/.projects)),format.raw/*86.23*/("""
      </p>
      """)))})),format.raw/*88.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column">
      <h2>
        Education
      </h2>
      """),_display_(Seq[Any](/*99.8*/if(user.experience != null)/*99.35*/{_display_(Seq[Any](format.raw/*99.36*/("""
      <p>
        """),_display_(Seq[Any](/*101.10*/user/*101.14*/.education)),format.raw/*101.24*/("""
      </p>
      """)))})),format.raw/*103.8*/("""
    </div>
  </div>
</div>
""")))})),format.raw/*107.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 30 11:58:31 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: dd8c5daa7e9091afa22df8e61caf4313ae91a363
                    MATRIX: 783->1|910->17|940->39|1007->71|1021->77|1083->118|1124->125|1149->142|1187->143|1224->146|1237->152|1265->159|1411->270|1451->301|1490->302|1522->315|1535->319|1574->320|1682->392|1697->398|1759->437|1806->452|1853->463|1887->488|1926->489|1983->510|1996->514|2027->523|2066->543|2079->547|2118->548|2195->593|2251->613|2266->619|2315->646|2544->839|2577->863|2616->864|2669->881|2682->885|2712->893|2760->909|2806->920|2847->952|2886->953|2939->970|2952->974|2990->990|3038->1006|3084->1017|3118->1042|3157->1043|3210->1060|3223->1064|3254->1073|3302->1089|3563->1314|3596->1338|3635->1339|3701->1369|3714->1373|3744->1381|3803->1408|4025->1595|4061->1622|4100->1623|4158->1645|4171->1649|4204->1660|4256->1681|4492->1882|4528->1909|4567->1910|4625->1932|4638->1936|4669->1945|4721->1966|4938->2148|4974->2175|5013->2176|5072->2198|5086->2202|5119->2212|5172->2233|5237->2266
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|52->24|52->24|52->24|59->31|59->31|59->31|60->32|60->32|60->32|61->33|63->35|63->35|63->35|64->36|64->36|64->36|65->37|67->39|67->39|67->39|68->40|68->40|68->40|69->41|81->53|81->53|81->53|83->55|83->55|83->55|85->57|97->69|97->69|97->69|99->71|99->71|99->71|101->73|112->84|112->84|112->84|114->86|114->86|114->86|116->88|127->99|127->99|127->99|129->101|129->101|129->101|131->103|135->107
                    -- GENERATED --
                */
            