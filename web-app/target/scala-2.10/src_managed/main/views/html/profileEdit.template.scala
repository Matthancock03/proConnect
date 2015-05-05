
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
      <a href=""""),_display_(Seq[Any](/*24.17*/routes/*24.23*/.DbController.profileMain())),format.raw/*24.50*/("""">
          <div>
          <button type="button" class="btn btn-default edit-button" name="editButton">Edit Profile</button>
        </div>
     </a>

    </div>
    <div class="col-xs-2"></div>

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

  <div class="row clearfix">
    <div class="col-md-12 column">
    <br /><br /><br />
    <div class="break-after">
    </div>
      <h3>
        Connections<br /><br />
      </h3>

    </div>
  </div>
  <div class="row clearfix">
    <div class="col-md-4 column">
      <img alt="140x140" src="http://lorempixel.com/140/140/" />
      <h3>
        Connection 1<br /><br />
      </h3>
    </div>
    <div class="col-md-4 column">
      <img alt="140x140" src="http://lorempixel.com/140/140/" />
      <h3>
        Connection 2<br /><br />
      </h3>
    </div>
    <div class="col-md-4 column">
      <img alt="140x140" src="http://lorempixel.com/140/140/" />
      <h3>
        Connection 3<br /><br />
      </h3>
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-md-4 column">
      <img alt="140x140" src="http://lorempixel.com/140/140/" />
      <h3>
        Connection 4
      </h3>
    </div>
    <div class="col-md-4 column">
      <img alt="140x140" src="http://lorempixel.com/140/140/" />
      <h3>
        Connection 5
      </h3>
    </div>
    <div class="col-md-4 column">
      <img alt="140x140" src="http://lorempixel.com/140/140/" />
      <h3>
        Connection 6
      </h3>
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-md-2 column">
    </div>
    <div class="col-md-6 column">
    </div>
    <div class="col-md-4 column">
      <ul class="pagination">

        <li>
          <a href="#">See all</a>
        </li>
      </ul>
    </div>
  </div>



>>>>>>> f9621eebc60b9a4b0951aaff41360a619414dca1
</div>
""")))})),format.raw/*182.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 04 17:10:29 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 15284ac29ac051203cf4bf4dc205288a2bb80268
                    MATRIX: 783->1|909->17|937->36|1003->67|1017->73|1079->114|1118->119|1143->136|1181->137|1217->139|1230->145|1258->152|1398->257|1438->288|1477->289|1570->346|1585->352|1647->391|1677->403|1690->407|1729->408|1836->479|1851->485|1913->524|1959->538|2005->548|2039->573|2078->574|2134->594|2147->598|2178->607|2216->626|2229->630|2268->631|2343->674|2396->691|2411->697|2460->724|2772->1000|2805->1024|2844->1025|2896->1041|2909->1045|2940->1054|2987->1069|3031->1078|3072->1110|3111->1111|3163->1127|3176->1131|3214->1147|3261->1162|3305->1171|3339->1196|3378->1197|3430->1213|3443->1217|3474->1226|3521->1241|3805->1489|3838->1513|3877->1514|3941->1542|3954->1546|3984->1554|4041->1579|4286->1789|4322->1816|4361->1817|4417->1837|4430->1841|4463->1852|4513->1871|4773->2096|4809->2123|4848->2124|4904->2144|4917->2148|4948->2157|4998->2176|5242->2384|5279->2411|5319->2412|5376->2432|5390->2436|5423->2446|5474->2465|7105->4064
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|52->24|52->24|52->24|62->34|62->34|62->34|63->35|63->35|63->35|64->36|66->38|66->38|66->38|67->39|67->39|67->39|68->40|70->42|70->42|70->42|71->43|71->43|71->43|72->44|84->56|84->56|84->56|86->58|86->58|86->58|88->60|100->72|100->72|100->72|102->74|102->74|102->74|104->76|115->87|115->87|115->87|117->89|117->89|117->89|119->91|132->104|132->104|132->104|134->106|134->106|134->106|136->108|210->182
                    -- GENERATED --
                */
            