
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
object navbar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href=""""),_display_(Seq[Any](/*13.38*/routes/*13.44*/.DbController.home())),format.raw/*13.64*/("""">Proconnect</a>
    </div>
  <!-- Collect the nav links, forms, and other content for toggling -->
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav">
      <li><a href=""""),_display_(Seq[Any](/*18.21*/routes/*18.27*/.DbController.home())),format.raw/*18.47*/("""">Home</a></li>
      <li><a href=""""),_display_(Seq[Any](/*19.21*/routes/*19.27*/.DbController.editProfile())),format.raw/*19.54*/("""">Profile</a></li>
      <li><a href=""""),_display_(Seq[Any](/*20.21*/routes/*20.27*/.Application.connections())),format.raw/*20.53*/("""">Connections</a></li>
      <li><a href=""""),_display_(Seq[Any](/*21.21*/routes/*21.27*/.Application.message())),format.raw/*21.49*/("""">Messages</a></li>
 <li><a href=""""),_display_(Seq[Any](/*22.16*/routes/*22.22*/.Application.forum())),format.raw/*22.42*/("""">Forums</a></li>

    </ul>
    """),_display_(Seq[Any](/*25.6*/form(routes.Application.search(), 'class -> "navbar-form navbar-left")/*25.76*/{_display_(Seq[Any](format.raw/*25.77*/("""
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
    """)))})),format.raw/*30.6*/("""

    <ul class="nav navbar-nav navbar-right">
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">My Account<span class="caret"></span></a>
        <ul class="dropdown-menu" role="menu">
          <li><a href="#">Settings</a></li>
          <li><a href=""""),_display_(Seq[Any](/*37.25*/routes/*37.31*/.Application.help())),format.raw/*37.50*/("""">Help</a></li>
          <li><a href=""""),_display_(Seq[Any](/*38.25*/routes/*38.31*/.Application.about())),format.raw/*38.51*/("""">About ProConnect</a></li>
          <li class="divider"></li>
          <li><a href=""""),_display_(Seq[Any](/*40.25*/securesocial/*40.37*/.controllers.routes.LoginPage.logout().absoluteURL())),format.raw/*40.89*/("""">Sign Out</a></li>
        </ul>
      </li>
    </ul>
  </div><!-- /.navbar-collapse -->
</div><!-- /.container-fluid -->
</nav>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 20 16:52:09 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/navbar.scala.html
                    HASH: fb51781a8009604671c4b74ffc85ddceeb4c3186
                    MATRIX: 872->17|1430->539|1445->545|1487->565|1750->792|1765->798|1807->818|1879->854|1894->860|1943->887|2018->926|2033->932|2081->958|2160->1001|2175->1007|2219->1029|2290->1064|2305->1070|2347->1090|2416->1124|2495->1194|2534->1195|2753->1383|3124->1718|3139->1724|3180->1743|3256->1783|3271->1789|3313->1809|3437->1897|3458->1909|3532->1961
                    LINES: 30->2|41->13|41->13|41->13|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|53->25|53->25|53->25|58->30|65->37|65->37|65->37|66->38|66->38|66->38|68->40|68->40|68->40
                    -- GENERATED --
                */
            