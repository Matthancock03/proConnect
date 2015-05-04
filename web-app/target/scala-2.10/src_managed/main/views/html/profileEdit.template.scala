
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
        <img class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*15.57*/routes/*15.63*/.DbController.getProfilePic(user.email))),format.raw/*15.102*/("""" />
      """)))}/*16.8*/else/*16.12*/{_display_(Seq[Any](format.raw/*16.13*/("""
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
                    DATE: Sun May 03 12:58:48 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: dc63048fe80ea22bdcaf1f0ceee5ed9f852ed3fa
                    MATRIX: 783->1|910->17|940->39|1007->71|1021->77|1083->118|1124->125|1149->142|1187->143|1224->146|1237->152|1265->159|1411->270|1451->301|1490->302|1584->360|1599->366|1661->405|1692->418|1705->422|1744->423|1852->495|1867->501|1929->540|1976->555|2023->566|2057->591|2096->592|2153->613|2166->617|2197->626|2236->646|2249->650|2288->651|2365->696|2421->716|2436->722|2485->749|2714->942|2747->966|2786->967|2839->984|2852->988|2882->996|2930->1012|2976->1023|3017->1055|3056->1056|3109->1073|3122->1077|3160->1093|3208->1109|3254->1120|3288->1145|3327->1146|3380->1163|3393->1167|3424->1176|3472->1192|3733->1417|3766->1441|3805->1442|3871->1472|3884->1476|3914->1484|3973->1511|4195->1698|4231->1725|4270->1726|4328->1748|4341->1752|4374->1763|4426->1784|4662->1985|4698->2012|4737->2013|4795->2035|4808->2039|4839->2048|4891->2069|5108->2251|5144->2278|5183->2279|5242->2301|5256->2305|5289->2315|5342->2336|5407->2369
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|52->24|52->24|52->24|59->31|59->31|59->31|60->32|60->32|60->32|61->33|63->35|63->35|63->35|64->36|64->36|64->36|65->37|67->39|67->39|67->39|68->40|68->40|68->40|69->41|81->53|81->53|81->53|83->55|83->55|83->55|85->57|97->69|97->69|97->69|99->71|99->71|99->71|101->73|112->84|112->84|112->84|114->86|114->86|114->86|116->88|127->99|127->99|127->99|129->101|129->101|129->101|131->103|135->107
                    -- GENERATED --
                */
            