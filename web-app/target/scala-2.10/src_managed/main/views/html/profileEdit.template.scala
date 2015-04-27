
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
                    DATE: Mon Apr 27 14:50:09 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 3615e398b2eb899b94eae3484bb655d6127852f5
                    MATRIX: 783->1|909->17|937->36|1003->67|1017->73|1079->114|1118->119|1143->136|1181->137|1217->139|1230->145|1258->152|1398->257|1438->288|1477->289|1507->300|1520->304|1559->305|1666->376|1681->382|1743->421|1789->435|1835->445|1869->470|1908->471|1964->491|1977->495|2008->504|2046->523|2059->527|2098->528|2173->571|2228->590|2243->596|2292->623|2514->809|2547->833|2586->834|2638->850|2651->854|2681->862|2728->877|2772->886|2813->918|2852->919|2904->935|2917->939|2955->955|3002->970|3046->979|3080->1004|3119->1005|3171->1021|3184->1025|3215->1034|3262->1049|3511->1262|3544->1286|3583->1287|3647->1315|3660->1319|3690->1327|3747->1352|3957->1527|3993->1554|4032->1555|4088->1575|4101->1579|4134->1590|4184->1609|4409->1799|4445->1826|4484->1827|4540->1847|4553->1851|4584->1860|4634->1879|4840->2050|4876->2077|4915->2078|4972->2098|4986->2102|5019->2112|5070->2131|5131->2160
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|52->24|52->24|52->24|59->31|59->31|59->31|60->32|60->32|60->32|61->33|63->35|63->35|63->35|64->36|64->36|64->36|65->37|67->39|67->39|67->39|68->40|68->40|68->40|69->41|81->53|81->53|81->53|83->55|83->55|83->55|85->57|97->69|97->69|97->69|99->71|99->71|99->71|101->73|112->84|112->84|112->84|114->86|114->86|114->86|116->88|127->99|127->99|127->99|129->101|129->101|129->101|131->103|135->107
                    -- GENERATED --
                */
            