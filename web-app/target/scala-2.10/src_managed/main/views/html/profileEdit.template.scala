
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
        """),_display_(Seq[Any](/*19.10*/if(user.userName != null)/*19.35*/{_display_(Seq[Any](format.raw/*19.36*/("""
              <h4>"""),_display_(Seq[Any](/*20.20*/user/*20.24*/.userName)),format.raw/*20.33*/("""</h4>
            """)))}/*21.14*/else/*21.18*/{_display_(Seq[Any](format.raw/*21.19*/("""
              <h4>Guest</h4>
            """)))})),format.raw/*23.14*/("""
      <a href=""""),_display_(Seq[Any](/*24.17*/routes/*24.23*/.DbController.profileMain())),format.raw/*24.50*/("""">
          <div>
          <button type="button" class="btn btn-default edit-button" name="editButton">Edit Profile</button>
        </div>
     </a>

    </div>
    <div class="col-xs-1"></div>

    <div class="col-md-6 column" style="background-color: #FFFFFF;">
        """),_display_(Seq[Any](/*34.10*/if(user.aboutMe != null)/*34.34*/{_display_(Seq[Any](format.raw/*34.35*/("""
          <h3>"""),_display_(Seq[Any](/*35.16*/user/*35.20*/.headline)),format.raw/*35.29*/("""</h3>
        """)))})),format.raw/*36.10*/("""

      """),_display_(Seq[Any](/*38.8*/if(user.currentEmployer != null)/*38.40*/{_display_(Seq[Any](format.raw/*38.41*/("""
          <h3>"""),_display_(Seq[Any](/*39.16*/user/*39.20*/.currentEmployer)),format.raw/*39.36*/("""</h3>
        """)))})),format.raw/*40.10*/("""

      """),_display_(Seq[Any](/*42.8*/if(user.location != null)/*42.33*/{_display_(Seq[Any](format.raw/*42.34*/("""
          <h3>"""),_display_(Seq[Any](/*43.16*/user/*43.20*/.location)),format.raw/*43.29*/("""</h3>
        """)))})),format.raw/*44.10*/("""
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
        """),_display_(Seq[Any](/*56.10*/if(user.aboutMe != null)/*56.34*/{_display_(Seq[Any](format.raw/*56.35*/("""
          <p>
            """),_display_(Seq[Any](/*58.14*/user/*58.18*/.aboutMe)),format.raw/*58.26*/("""
          </p>
        """)))})),format.raw/*60.10*/("""

      </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
      <h2>
        Experience
      </h2>
      """),_display_(Seq[Any](/*72.8*/if(user.experience != null)/*72.35*/{_display_(Seq[Any](format.raw/*72.36*/("""
      <p>
        """),_display_(Seq[Any](/*74.10*/user/*74.14*/.experience)),format.raw/*74.25*/("""
      </p>
      """)))})),format.raw/*76.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
      <h2>
        Projects or Skills Highlight
      </h2>
      """),_display_(Seq[Any](/*87.8*/if(user.experience != null)/*87.35*/{_display_(Seq[Any](format.raw/*87.36*/("""
      <p>
        """),_display_(Seq[Any](/*89.10*/user/*89.14*/.projects)),format.raw/*89.23*/("""
      </p>
      """)))})),format.raw/*91.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>

    <div class="col-xs-8 column" style="background-color: #FFFFFF;">

      <h2>
        Education
      </h2>
      """),_display_(Seq[Any](/*104.8*/if(user.experience != null)/*104.35*/{_display_(Seq[Any](format.raw/*104.36*/("""
      <p>
        """),_display_(Seq[Any](/*106.10*/user/*106.14*/.education)),format.raw/*106.24*/("""
      </p>
      """)))})),format.raw/*108.8*/("""
    </div>
  </div>


</div>
""")))})),format.raw/*114.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 05 11:02:40 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: fb21e8a5e5cd933a7e43e84cf22c25dab4343db2
                    MATRIX: 783->1|909->17|937->36|974->39|999->56|1037->57|1073->59|1086->65|1114->72|1180->103|1194->109|1252->146|1394->253|1434->284|1473->285|1566->342|1581->348|1643->387|1673->399|1686->403|1725->404|1832->475|1847->481|1909->520|1955->534|2001->544|2035->569|2074->570|2130->590|2143->594|2174->603|2212->622|2225->626|2264->627|2339->670|2392->687|2407->693|2456->720|2768->996|2801->1020|2840->1021|2892->1037|2905->1041|2936->1050|2983->1065|3027->1074|3068->1106|3107->1107|3159->1123|3172->1127|3210->1143|3257->1158|3301->1167|3335->1192|3374->1193|3426->1209|3439->1213|3470->1222|3517->1237|3801->1485|3834->1509|3873->1510|3937->1538|3950->1542|3980->1550|4037->1575|4282->1785|4318->1812|4357->1813|4413->1833|4426->1837|4459->1848|4509->1867|4769->2092|4805->2119|4844->2120|4900->2140|4913->2144|4944->2153|4994->2172|5238->2380|5275->2407|5315->2408|5372->2428|5386->2432|5419->2442|5470->2461|5533->2492
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|52->24|52->24|52->24|62->34|62->34|62->34|63->35|63->35|63->35|64->36|66->38|66->38|66->38|67->39|67->39|67->39|68->40|70->42|70->42|70->42|71->43|71->43|71->43|72->44|84->56|84->56|84->56|86->58|86->58|86->58|88->60|100->72|100->72|100->72|102->74|102->74|102->74|104->76|115->87|115->87|115->87|117->89|117->89|117->89|119->91|132->104|132->104|132->104|134->106|134->106|134->106|136->108|142->114
                    -- GENERATED --
                */
            